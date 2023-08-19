package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person implements PersonInterface{

    @Qualifier("user2")
    @Autowired
    private UserInterface userInterface;


    @Override
    public void pim() {
        System.out.println("I am Person");
    }

    @Override
    public void call() {
        this.userInterface.uim();
    }
}
