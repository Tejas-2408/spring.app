package com.autowiring.config;

import com.autowiring.bean.VehicleMul;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "com.autowiring.bean")
public class ConfigMultVehicle {

    @Bean
    @Primary
    VehicleMul vehicle1(){
        VehicleMul v = new VehicleMul();
        v.setName("Audi");
        return v;
    }

    @Bean
    VehicleMul vehicle3(){
        VehicleMul v = new VehicleMul();
        v.setName("Honda");
        return v;
    }
}
