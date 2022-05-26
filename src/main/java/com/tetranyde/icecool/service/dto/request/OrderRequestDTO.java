package com.tetranyde.icecool.service.dto.request;

import com.tetranyde.icecool.service.enums.ConeType;
import com.tetranyde.icecool.service.enums.FillingType;
import com.tetranyde.icecool.service.enums.FlavorsType;

public class OrderRequestDTO {

    private FlavorsType flavorsType;
    private String fillingType;
    private ConeType coneType;

    public OrderRequestDTO() {
    }

    public OrderRequestDTO(FlavorsType flavorsType, String fillingType, ConeType coneType) {
        this.flavorsType = flavorsType;
        this.fillingType = fillingType;
        this.coneType = coneType;
    }

    public FlavorsType getFlavorsType() {
        return flavorsType;
    }

    public void setFlavorsType(FlavorsType flavorsType) {
        this.flavorsType = flavorsType;
    }

    public String getFillingType() {
        return fillingType;
    }

    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    public ConeType getConeType() {
        return coneType;
    }

    public void setConeType(ConeType coneType) {
        this.coneType = coneType;
    }

    @Override
    public String toString() {
        return "OrderRequestDTO{" +
                "flavorsType=" + flavorsType +
                ", fillingType='" + fillingType + '\'' +
                ", coneType=" + coneType +
                '}';
    }
}
