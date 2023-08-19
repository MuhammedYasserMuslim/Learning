package org.spring.orderaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AopClass {

    @Before("execution( public * callOwn())")
    public void star(){
        System.out.println("Star Succefully");
    }

    @Before("execution( public * callOwn())")
    public void Log(){
        System.out.println("Login Succefully");
    }


}
