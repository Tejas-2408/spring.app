package com.autowiring.implementations;

import com.autowiring.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpearkers implements Speaker {
    @Override
    public String makeSound() {
        return "Play music from Sony Speakers";
    }
}
