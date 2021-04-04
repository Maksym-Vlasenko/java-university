package com.company.march20.callbacks;

public class Button {
    private final EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        System.out.println("<<<< Method 'click()' >>>>");
        eventHandler.execute();
    }
}
