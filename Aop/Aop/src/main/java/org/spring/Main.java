package org.spring;

import org.spring.configration.Config;
import org.spring.model.PersonInterface;
import org.spring.model.User;
import org.spring.model.UserInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PersonInterface p = context.getBean("person",PersonInterface.class);
        p.callYou(new User());
        p.callMe(5);

    }
}