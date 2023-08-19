package com.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Basketball implements Sport{
    @Override
    public void star() {
        System.out.println("I am Basketball");
    }
    @PostConstruct
    public void init(){
        System.out.println("init Basketball");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy Basketball");
    }
}
