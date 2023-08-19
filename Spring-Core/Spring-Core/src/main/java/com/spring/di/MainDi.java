package com.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDi {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext config =
                new AnnotationConfigApplicationContext(ConfigDi.class);
        PersonInterface person = config.getBean("person",PersonInterface.class);
        person.call();


    }
}
