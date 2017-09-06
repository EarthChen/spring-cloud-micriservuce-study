package com.earthchen;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Spring Cloud Feign是一套基于Netflix Feign实现的声明式服务调用客户端。
 * 它使得编写Web服务客户端变得更加简单。
 * 我们只需要通过创建接口并用注解来配置它既可完成对Web服务接口的绑定
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignApplication.class)
                .web(true)
                .run(args);
    }
}
