//package com.autowiring.main;
//
//import com.autowiring.bean.PersonConstAutoWireMultBean;
//import com.autowiring.bean.VehicleMul;
//import com.autowiring.config.ConfigMultVehicle;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Wiring6 {
//    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ConfigMultVehicle.class);
//        PersonConstAutoWireMultBean p = context.getBean(PersonConstAutoWireMultBean.class);
//        VehicleMul v = context.getBean(VehicleMul.class);
//        System.out.println("Person name from Spring Context "+ p.getName());
//        System.out.println("Vehicle name from Spring Context is "+ v.getName());
//        System.out.println("Vehcile owned by Person is " + p.getVehicle());
//    }
//}
