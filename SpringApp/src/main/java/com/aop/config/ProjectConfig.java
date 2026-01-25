package com.aop.config;

// This class will contain @Bean definition methods

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.aop.aspect","com.aop.implementation","com.aop.services"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
