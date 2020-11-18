package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DemoConsumerController {

    @Reference(lazy=true)
    private DemoService demoService;

    @RequestMapping("/home")
    public String sayHello(@RequestParam(name="name", defaultValue="dubbo") String name) { return demoService.sayHello(name);
    }

}