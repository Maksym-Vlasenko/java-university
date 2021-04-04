package com.company.march14;

public class Employee extends Human {
    private String company;

    public Employee(String company, String name, int age) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void greet(Person other) {
        super.greet(other);
        System.out.println("I am working at the company " + this.company + "\n");
    }
}
