package org.sang;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Created by sang on 2018/7/11.
 */
//@Configuration
public class MyErrorAttributeBak {
    @Bean
    DefaultErrorAttributes defaultErrorAttributes() {
        return new DefaultErrorAttributes(){
            @Override
            public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
                Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
                errorAttributes.put("mymsg", "出错啦！");
                errorAttributes.remove("error");
                return errorAttributes;
            }
        };
    }
}
