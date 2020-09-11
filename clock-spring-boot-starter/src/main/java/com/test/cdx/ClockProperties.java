package com.test.cdx;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "clock")
//默认配置clock.time_zone = "Asia/Shanghai"
public class ClockProperties {
    private String time_zone = "Asia/Shanghai";
}
