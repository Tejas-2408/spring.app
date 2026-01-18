package com.autowiring.config;

import com.autowiring.bean.Person;
import com.autowiring.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConif {

    @Bean
    Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Maruti");
        return v;
    }

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Tejas");
        p.setVehicle(vehicle());
        return p;
    }

    @Bean("methodParameter")
    Person person2(Vehicle v){
        Person p = new Person();
        p.setName("Method Bansal");
        p.setVehicle(v);
        return p;
    }
}
