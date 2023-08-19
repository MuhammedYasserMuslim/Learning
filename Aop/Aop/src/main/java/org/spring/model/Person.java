package org.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Person implements PersonInterface{
    @Override
    public void callYou(User user) {
        System.out.println("I am Person .....You");
    }
    @Override
    public void callMe(int x) {
        System.out.println("I am Person .....Me");
    }
}
