package com.nosuchfield.run;

import com.test.cdx.HttpClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class RunIt {
    @Resource
    private HttpClient httpClient;
    public void hello() {
        System.out.println(httpClient.getHtml());
    }

}
