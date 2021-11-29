package com.alphacoder.designpattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class WindowButton implements Button{
    private final ButtonType buttonType;

    @Override
    public String toString(){
        return "Window's "+ buttonType+ " button.";
    }
}
