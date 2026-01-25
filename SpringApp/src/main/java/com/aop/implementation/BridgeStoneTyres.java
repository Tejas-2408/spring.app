package com.aop.implementation;

import com.aop.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyre {
    @Override
    public String rotate(){
        return "Vehicle moving with the help of BridgeStone tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of BridgeStone tyres";
    }
}
