package com.example;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        System.out.println("UIControl");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
