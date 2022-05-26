package com.tetranyde.icecool.service.enums;

public enum FlavorsType {

    Raspberry_Slushy (200.0),
    Coco_Coffee (350.0),
    Nutty_Fruit (150.0),
    Pistachio_Delight (350.0);

    private double price;

    FlavorsType() {
    }

    FlavorsType(double v) {
        this.price = v;
    }

    public double getValue(){
        return price;
    }

}
