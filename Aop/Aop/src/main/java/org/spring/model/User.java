package org.spring.model;

import org.springframework.stereotype.Component;

@Component
public class User implements UserInterface{
    @Override
    public void callYou() {
        System.out.println("I am User .....You");
    }
    @Override
    public void callMe() {
        System.out.println("I am Person .....Me");
    }
}
