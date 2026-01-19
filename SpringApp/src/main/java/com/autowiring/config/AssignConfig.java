package com.autowiring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.autowiring.implementations","com.autowiring.services"})
@ComponentScan(basePackageClasses = {com.autowiring.bean.VehicleAssign.class, com.autowiring.bean.PersonAssign.class})
public class AssignConfig {

}
