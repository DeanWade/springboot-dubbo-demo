package com.imooc.springboot.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.imooc.springboot.dubbo.demo.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}