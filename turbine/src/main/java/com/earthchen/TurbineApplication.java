package com.earthchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


/**
 * 引入Turbine来对服务的Hystrix数据进行聚合展示
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication {



    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}