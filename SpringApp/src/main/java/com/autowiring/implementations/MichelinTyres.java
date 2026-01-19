package com.autowiring.implementations;

import com.autowiring.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre {
    @Override
    public String rotate() {
        return "Moving Mechline tyre";
    }
}
