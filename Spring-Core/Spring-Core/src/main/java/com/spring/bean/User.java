package com.spring.bean;

import org.springframework.stereotype.Component;


public class User implements UserInterface {
    @Override
    public void uim() {
        System.out.println("I am User ");
    }
}
