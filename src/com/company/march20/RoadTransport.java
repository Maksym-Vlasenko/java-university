package com.company.march20;

public abstract class RoadTransport implements Transport {
    private String model;
    private String vendor;

    public RoadTransport(String model, String vendor) {
        this.model = model;
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
