package com.autowiring.implementations;

import com.autowiring.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speaker {
    @Override
    public String makeSound() {
        return "Play music in Bose Speakers";
    }
}
