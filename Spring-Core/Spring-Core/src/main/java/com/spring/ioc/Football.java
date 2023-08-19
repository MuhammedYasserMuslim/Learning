package com.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Football implements Sport{
    @Override
    public void star() {
        System.out.println("I am Football");
    }

    @PostConstruct
    public void init(){
        System.out.println("init Football");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy Football");
    }
}
