package com.company.february27;

public class MobilePhone extends Phone {
    private String mobileOperator;

    public MobilePhone(String model, String color, int number, String mobileOperator) {
        super(model, color, number);
        this.mobileOperator = mobileOperator;
    }

    public String getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    @Override
    public String toString() {
        return "MobilePhone = {" +
                "model = " + super.getModel() +
                ", color = " + super.getColor() +
                ", number = " + super.getNumber() +
                ", mobileOperator = " + this.mobileOperator +
                "}";
    }
}
