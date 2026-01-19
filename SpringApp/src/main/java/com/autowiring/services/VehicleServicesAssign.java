package com.autowiring.services;

import com.autowiring.interfaces.Speaker;
import com.autowiring.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServicesAssign {

    @Autowired
    private Speaker speaker;
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    @Autowired
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic(){
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyre.rotate();
        System.out.println(status);
    }
}
