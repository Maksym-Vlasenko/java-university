package com.company.march20;

public enum TransportType {
    ROAD("Road transport"),
    AIR("Air transport"),
    SEA("Sea transport"),
    UNDERGROUND;

    private String fullName;

    TransportType(String fullName) {
        this.fullName = fullName;
    }

    TransportType() {}

    public String getFullName() {
        return this.fullName;
    }
}
