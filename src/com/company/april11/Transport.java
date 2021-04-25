package com.company.april11;

public interface Transport {
    int NUMBER = 10;

    void ride();

    default int test() {
        return 0;
    }

    static void hello() {
        System.out.println("Hello from the Transport interface");
    }
}
