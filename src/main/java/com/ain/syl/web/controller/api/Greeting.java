package com.ain.syl.web.controller.api;

public class Greeting {
    private final String text;

    public Greeting(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
