package com.earthchen;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * config client
 * 获取配置信息
 */
@SpringBootApplication
public class ConfigClientApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class)
                .web(true)
                .run(args);
    }
}
