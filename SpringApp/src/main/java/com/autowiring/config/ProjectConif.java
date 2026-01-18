package com.autowiring.config;

import com.autowiring.bean.PersonAutowire;
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
    PersonAutowire person(){
        PersonAutowire p = new PersonAutowire();
        p.setName("Tejas");
        p.setVehicle(vehicle());
        return p;
    }

    @Bean("methodParameter")
    PersonAutowire person2(Vehicle v){
        PersonAutowire p = new PersonAutowire();
        p.setName("Method Bansal");
        p.setVehicle(v);
        return p;
    }
}
