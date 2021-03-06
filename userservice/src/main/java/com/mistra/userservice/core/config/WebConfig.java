package com.mistra.userservice.core.config;


import com.mistra.userservice.core.JWT.JsonWebTokenProperties;
import com.mistra.userservice.core.BasedInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: WangRui
 * @Date: 2018/11/30
 * Time: 16:53
 * Description:
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private BasedInterceptor basedInterceptor;

    @Autowired
    private JsonWebTokenProperties jsonWebTokenProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(basedInterceptor).addPathPatterns("/**").excludePathPatterns(jsonWebTokenProperties.getIgnoreUrl());
    }
}
