//package com.autowiring.bean;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PersonConstAutoWireMultBean {
//    private String name = "Tejas";
//    private final VehicleMul vehicle;
//
//
//    // this will autowire with Primary Vehicle Bean
//    @Autowired
//    public PersonConstAutoWireMultBean(VehicleMul vehicle){
//        System.out.println("Person Bean has been created by Spring");
//        this.vehicle = vehicle;
//    }
//
////    @Autowired // this will map the bean based on qualifier
////    public PersonConstAutoWireMultBean(@Qualifier("vehicle3") VehicleMul vehicle){
////        System.out.println("Person Bean has been created by Spring");
////        this.vehicle = vehicle;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public VehicleMul getVehicle() {
//        return vehicle;
//    }
//}