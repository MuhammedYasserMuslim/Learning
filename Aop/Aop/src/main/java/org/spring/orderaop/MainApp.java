package org.spring.orderaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigClass.class);
        Own own=context.getBean("own",Own.class);
        own.callOwn();
    }
}

