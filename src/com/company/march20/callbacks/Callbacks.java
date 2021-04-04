package com.company.march20.callbacks;

public class Callbacks {
    public static void main(String[] args) {
        EventHandler buttonEventHandler = new ButtonEventHandler();
        Button button = new Button(buttonEventHandler);
        button.click();
        button.click();
        button.click();
    }
}
