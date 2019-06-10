package org.sang;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by sang on 2018/7/21.
 */
@Configuration
public class RestConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setDefaultPageSize(2)
                .setPageParamName("page")
                .setLimitParamName("size")
                .setSortParamName("sort")
                .setBasePath("/api")
                .setReturnBodyOnCreate(true)
                .setReturnBodyOnUpdate(true);
    }
}
