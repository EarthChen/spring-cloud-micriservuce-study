package com.earthchen;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * 构建一个Hystrix Dashboard
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardApplication {



    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}