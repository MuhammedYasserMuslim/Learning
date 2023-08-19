package com.spring.bean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext conig =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        UserInterface u = conig.getBean("myUser",UserInterface.class);
        u.uim();



    }
}
