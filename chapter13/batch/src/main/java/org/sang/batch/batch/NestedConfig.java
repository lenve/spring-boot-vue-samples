package org.sang.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.JobStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.Resource;

//@Configuration
public class NestedConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;
    @Bean
    Job parentJob(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return jobBuilderFactory.get("parentJob")
                .start(pChildJobStep1(jobRepository,transactionManager))
                .next(pChildJobStep2(jobRepository,transactionManager))
                .build();
    }

    @Resource(name = "childJobOne")
    Job childJobOne;
    @Resource(name = "childJobTwo")
    Job childJobTwo;
    @Autowired
    JobLauncher jobLauncher;

    @Bean
    Step pChildJobStep2(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new JobStepBuilder(new StepBuilder("pChildJobStep2"))
                .job(childJobTwo)
                .launcher(jobLauncher)
                .repository(jobRepository)
                .transactionManager(transactionManager).build();
    }

    @Bean
    Step pChildJobStep1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new JobStepBuilder(new StepBuilder("pChildJobStep1"))
                .job(childJobOne)
                .launcher(jobLauncher)
                .repository(jobRepository)
                .transactionManager(transactionManager).build();
    }
}
