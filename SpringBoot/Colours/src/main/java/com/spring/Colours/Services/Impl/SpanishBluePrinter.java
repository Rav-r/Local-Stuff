package com.spring.Colours.Services.Impl;

import com.spring.Colours.Services.BluePrinter;
import org.springframework.stereotype.Component;

@Component

public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print(){
        return "Azul";
    }
}
