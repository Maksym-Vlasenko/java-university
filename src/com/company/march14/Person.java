package com.company.march14;

public interface Person {
    int NUMBER = 100;

    String getName();
    void setName(String name);

    int getAge();
    void setAge(int age);

    static void test() {
        System.out.println("Test");
    }

    default void greet(Person other) {
        String otherPersonName = getOtherPersonName(other);
        System.out.printf("Hello %s, my name is %s!%n", otherPersonName, this.getName());
    }

    private String getOtherPersonName(Person other) {
        return other.getName();
    }
}
