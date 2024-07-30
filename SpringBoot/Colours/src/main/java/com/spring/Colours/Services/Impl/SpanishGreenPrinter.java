package com.spring.Colours.Services.Impl;

import com.spring.Colours.Services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component

public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print(){
        return "Verde";
    }
}
