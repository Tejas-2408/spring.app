package com.school.model;

import lombok.Data;

@Data
public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;


    public enum Type {
        FESTIVAL, FEDERAL
    }


    // Data annotation of lombok has been used therefore constructor, getter and setters are not required

//    public Holiday(String day, String reason, Type type) {
//        this.day = day;
//        this.reason = reason;
//        this.type = type;
//    }
//
//    public String getDay() {
//        return day;
//    }
//
//    public String getReason() {
//        return reason;
//    }
//
//    public Type getType() {
//        return type;
//    }
}
