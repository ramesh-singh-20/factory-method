package com.alphacoder.designpattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HtmlButton implements Button{
    private final ButtonType buttonType;

    @Override
    public String toString(){
        return "HTML's "+ buttonType+ " button.";
    }
}
