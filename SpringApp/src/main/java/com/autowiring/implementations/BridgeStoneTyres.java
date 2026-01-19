package com.autowiring.implementations;

import com.autowiring.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyre {
    @Override
    public String rotate() {
        return "Rotating BridgeStone Tyres";
    }
}
