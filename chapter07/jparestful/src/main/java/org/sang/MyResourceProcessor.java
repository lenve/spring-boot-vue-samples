package org.sang;

import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.ResourceSupport;

@Configuration
public class MyResourceProcessor implements ResourceProcessor {
    @Override
    public ResourceSupport process(ResourceSupport resourceSupport) {
        resourceSupport.add(new Link("http://www.baidu.com", "百度一下"));
        return resourceSupport;
    }
}
