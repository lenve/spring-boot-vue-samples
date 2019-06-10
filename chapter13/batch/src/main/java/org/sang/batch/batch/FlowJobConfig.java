package org.sang.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FlowJobConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    Step flowStep1() {
        return stepBuilderFactory.get("deciderStep1")
                .tasklet(new Tasklet() {
                    @Override
                    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                        System.out.println("deciderStep1");
                        return RepeatStatus.FINISHED;
                    }
                }).build();
    }

    @Bean
    Step flowStep2() {
        return stepBuilderFactory.get("deciderStep2")
                .tasklet(new Tasklet() {
                    @Override
                    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                        System.out.println("deciderStep2");
                        return RepeatStatus.FINISHED;
                    }
                }).build();
    }

    @Bean
    Step flowStep3() {
        return stepBuilderFactory.get("deciderStep3")
                .tasklet(new Tasklet() {
                    @Override
                    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                        System.out.println("deciderStep3");
                        return RepeatStatus.FINISHED;
                    }
                }).build();
    }

    @Bean
    Flow flow1() {
        return new FlowBuilder<Flow>("flow1")
                .start(flowStep1())
                .next(flowStep2())
                .build();
    }

    @Bean
    Flow flow2() {
        return new FlowBuilder<Flow>("flow2")
                .start(flowStep3())
                .build();
    }

    @Bean
    Job flowJob() {
        return jobBuilderFactory.get("deciderJob").start(flow1()).next(flow2()).end().build();
    }
}
