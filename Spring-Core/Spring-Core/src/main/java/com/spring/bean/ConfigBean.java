package com.spring.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    @Bean
    public UserInterface myUser(){
        UserInterface user = new User();
        return user;
    }


}
