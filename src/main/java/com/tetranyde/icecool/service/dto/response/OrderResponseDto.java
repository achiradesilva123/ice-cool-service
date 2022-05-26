package com.tetranyde.icecool.service.dto.response;

public class OrderResponseDto{

    private double flavorPrice;
    private double fillingPrice;
    private double conePrice;
    private double total;

    public OrderResponseDto() {
    }

    public OrderResponseDto(double flavorPrice, double conePrice) {
        this.flavorPrice = flavorPrice;
        this.conePrice = conePrice;
    }

    public OrderResponseDto(double flavorPrice, double fillingPrice, double conePrice) {
        this.flavorPrice = flavorPrice;
        this.fillingPrice = fillingPrice;
        this.conePrice = conePrice;
    }

    public OrderResponseDto(double flavorPrice, double fillingPrice, double conePrice, double total) {
        this.flavorPrice = flavorPrice;
        this.fillingPrice = fillingPrice;
        this.conePrice = conePrice;
        this.total = total;
    }

    public double getFlavorPrice() {
        return flavorPrice;
    }

    public void setFlavorPrice(double flavorPrice) {
        this.flavorPrice = flavorPrice;
    }

    public double getFillingPrice() {
        return fillingPrice;
    }

    public void setFillingPrice(double fillingPrice) {
        this.fillingPrice = fillingPrice;
    }

    public double getConePrice() {
        return conePrice;
    }

    public void setConePrice(double conePrice) {
        this.conePrice = conePrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderResponseDto{" +
                "flavorPrice=" + flavorPrice +
                ", fillingPrice=" + fillingPrice +
                ", conePrice=" + conePrice +
                ", total=" + total +
                '}';
    }
}
