package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(lazy=true)
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(name="name", value="dubbo") String name) { return demoService.sayHello(name);
    }

}