package org.sang;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created by sang on 2018/7/8.
 */
//@Configuration
public class MyWebMvcConfig2 implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        System.out.println("converters.size()>>>"+converters.size());
//        converters.clear();
//        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gson);
//        converters.add(converter);
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = converter.getFastJsonConfig();
//        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
//        fastJsonConfig.setDateFormat("yyyy/MM/dd");
//        converters.add(converter);

    }

//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.clear();
//        com.google.gson.Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gson);
//        converters.add(converter);
//    }
}
