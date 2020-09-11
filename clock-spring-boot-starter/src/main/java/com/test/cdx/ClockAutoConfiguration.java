package com.test.cdx;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(ClockProperties.class)
public class ClockAutoConfiguration {
    @Resource
    private ClockProperties clockProperties;
    @Bean
    //默认时区注入到ClockCalculate
    public ClockCalculate init(){
        ClockCalculate clockCalculate = new ClockCalculate();
        clockCalculate.setTime_zone(clockProperties.getTime_zone());
        return clockCalculate;
    }
}
