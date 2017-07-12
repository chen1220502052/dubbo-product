package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Autowired
    private DemoService demoService;
    
    
    @Override
    public void sayHello(){
        System.out.println("hahhhhhhhhhhhhhhhhhhhhhahhahahahahhh");
        System.out.println(demoService.sayHello());
    }
}
