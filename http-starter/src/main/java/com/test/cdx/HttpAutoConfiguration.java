package com.test.cdx;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpAutoConfiguration {
    @Resource
    private HttpProperties properties;
    @Bean
    public HttpClient init() {
        HttpClient client = new HttpClient();
        String url = properties.getUrl();
        client.setUrl(url);
        return client;
    }

}






















//在上面的AutoConfiguration中我们实现了自己要求：
// 在Spring的上下文中创建了一个HttpClient类的bean，
// 并且我们把properties中的一个参数赋给了该bean。