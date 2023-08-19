package com.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Volleyball implements Sport{
    @Override
    public void star() {
        System.out.println("I am Volleyball");
    }

    @PostConstruct
    public void init(){
        System.out.println("init Volleyball");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy Volleyball");
    }
}
