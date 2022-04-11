package com.example;

public class TextBox extends UIControl {
    public String text = ""; // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}
