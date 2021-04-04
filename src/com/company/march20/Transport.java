package com.company.march20;

public interface Transport extends Runnable {
    Class<?> type = Transport.class;

    String getModel();

    default void beep() {
        System.out.println(getBeep());
    }

    static void showType() {
        System.out.println(type.getName());
    }

    private String getBeep() {
        return "Beep beep";
    }

}
