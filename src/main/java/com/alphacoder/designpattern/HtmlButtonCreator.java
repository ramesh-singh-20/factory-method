package com.alphacoder.designpattern;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class HtmlButtonCreator implements ButtonCreator{

    private static final Map<ButtonType, Button> HTML_BUTTONS;

    static {
        HTML_BUTTONS= new EnumMap<>(ButtonType.class);
        Arrays.stream(ButtonType.values()).forEach(value -> HTML_BUTTONS.put(value, new HtmlButton(value)));
    }

    @Override
    public Button getButton(ButtonType buttonType) {
        return HTML_BUTTONS.get(buttonType);
    }

    @Override
    public String toString(){
        return "The HTML button creator.";
    }
}
