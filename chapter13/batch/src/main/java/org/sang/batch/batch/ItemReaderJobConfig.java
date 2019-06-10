package org.sang.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//@Configuration
public class ItemReaderJobConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    Step itemReaderStep() {
        return stepBuilderFactory.get("itemReaderStep")
                .chunk(2)
                .reader(new MyItemReader(Arrays.asList("三国", "水浒", "西游", "红楼")))
                .writer(list -> {
                    System.out.println(list);
                }).build();
    }
    @Bean
    Job itemReaderJob() {
        return jobBuilderFactory.get("itemReaderJob")
                .start(itemReaderStep())
                .build();
    }
}
