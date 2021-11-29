package com.alphacoder.designpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ButtonType {
    SUBMIT("submit"),
    UPDATE("update"),
    DELETE("delete");

    private final String title;

    @Override
    public String toString(){
        return title;
    }
}
