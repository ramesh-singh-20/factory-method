package com.alphacoder.designpattern;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class WindowButtonCreator implements ButtonCreator{
    private static final Map<ButtonType, WindowButton> WINDOW_BUTTONS;

    static {
        WINDOW_BUTTONS= new EnumMap<>(ButtonType.class);
        Arrays.stream(ButtonType.values()).forEach(value -> WINDOW_BUTTONS.put(value, new WindowButton(value)));
    }

    @Override
    public Button getButton(ButtonType buttonType) {
        return WINDOW_BUTTONS.get(buttonType);
    }

    @Override
    public String toString(){
        return "The Window button creator";
    }
}
