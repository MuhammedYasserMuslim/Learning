package org.spring.orderaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AopClass2 {

    @After("execution( public * callOwn())")
    public void Log(){
        System.out.println("Logout Succefully");
    }
}
