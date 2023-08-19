package com.spring.di;

import org.springframework.stereotype.Component;

@Component
public class User2 implements UserInterface{
    @Override
    public void uim() {
        System.out.println("I am User Two");
    }
}
