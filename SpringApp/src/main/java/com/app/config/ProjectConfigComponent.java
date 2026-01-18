package com.app.config;

import com.app.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app.beans")
public class ProjectConfigComponent {
    Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Component Tesla");
        return v;
    }
}
