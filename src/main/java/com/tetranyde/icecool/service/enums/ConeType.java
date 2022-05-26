package com.tetranyde.icecool.service.enums;

public enum ConeType {

    Wafer_cone (20.00),
    Waffle_cone (40.00),
    Waffle_bowl (50.00),
    Ice_cream_sandwich_wafers (50.00);

    private double price;

    ConeType(double v) {
     this.price = v;
    }

    public double getPrice() {
        return price;
    }

}
