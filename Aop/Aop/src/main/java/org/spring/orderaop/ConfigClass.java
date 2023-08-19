package org.spring.orderaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.spring.orderaop")
@EnableAspectJAutoProxy
public class ConfigClass {
}
