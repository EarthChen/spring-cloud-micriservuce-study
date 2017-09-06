package com.earthchen.web;

import com.earthchen.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {


    @Autowired
    DcClient dcClient;


    /**
     * 通过定义的feign客户端来调用服务提供方的接口
     * @return
     */
    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}