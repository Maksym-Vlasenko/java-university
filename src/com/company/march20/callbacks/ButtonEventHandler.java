package com.company.march20.callbacks;

public class ButtonEventHandler implements EventHandler {
    @Override
    public void execute() {
        System.out.println("<<<< Method 'execute()' (callback) >>>>");
        System.out.println("Button has been clicked\n");
    }
}
