package com.spring.Colours.Services.Impl;

import com.spring.Colours.Services.BluePrinter;
import com.spring.Colours.Services.ColourPrinter;
import com.spring.Colours.Services.GreenPrinter;
import com.spring.Colours.Services.RedPrinter;
import com.spring.Colours.Services.Impl.EnglishRedPrinter;
import com.spring.Colours.Services.Impl.EnglishBluePrinter;
import com.spring.Colours.Services.Impl.EnglishGreenPrinter;
import org.springframework.stereotype.Component;

@Component

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;
    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;

    }
    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
