package com.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainIoc {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext config =
               new AnnotationConfigApplicationContext(ConfigIoc.class);
       Sport sport =config.getBean("basketball",Sport.class);
       sport.star();
       config.close();
    }
}