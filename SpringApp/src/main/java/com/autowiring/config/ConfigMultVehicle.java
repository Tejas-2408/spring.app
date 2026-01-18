package com.autowiring.config;

import com.autowiring.bean.Vehicle2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "com.autowiring.bean")
public class ConfigMultVehicle {

    @Bean
    @Primary
    Vehicle2 vehicle1(){
        Vehicle2 v = new Vehicle2();
        v.setName("Audi");
        return v;
    }

    @Bean
    Vehicle2 vehicle3(){
        Vehicle2 v = new Vehicle2();
        v.setName("Honda");
        return v;
    }
}
