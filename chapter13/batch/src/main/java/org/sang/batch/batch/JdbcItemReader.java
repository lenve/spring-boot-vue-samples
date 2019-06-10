package org.sang.batch.batch;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.MySqlPagingQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

//@Configuration
public class JdbcItemReader {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;
    @Autowired
    DataSource dataSource;
    @Bean
    @StepScope
    ItemReader<User> itemReader() {
        JdbcPagingItemReader<User> reader = new JdbcPagingItemReader<>();
        reader.setFetchSize(2);
        reader.setDataSource(dataSource);
        reader.setRowMapper(new BeanPropertyRowMapper<>(User.class));
        MySqlPagingQueryProvider provider = new MySqlPagingQueryProvider();
        provider.setSelectClause("id,username,address,gender");
        provider.setFromClause("from user");
        Map<String, Order> sort = new HashMap<>();
        sort.put("id", Order.DESCENDING);
        provider.setSortKeys(sort);
        reader.setQueryProvider(provider);
        return reader;
    }

    @Bean
    Step jdbcStep() {

        return stepBuilderFactory.get("jdbcStep")
                .<User,User>chunk(2)
                .reader(itemReader())
                .writer(u->{
                    System.out.println(u.toString());
                })
                .build();
    }
    @Bean
    Job jdbcJob() {
        return jobBuilderFactory.get("jdbcJob")
                .start(jdbcStep())
                .build();
    }
}
