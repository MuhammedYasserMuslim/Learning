package org.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Database {

    @Before("execution( public void org.spring.model.*.*(..))")   // funiction name called point cut(from video 8 to 13 in Aop)
    public void connection(){
        System.out.println("Connected .....");
    }
}
