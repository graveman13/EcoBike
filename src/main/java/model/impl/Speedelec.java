package model.impl;

import model.AbstractElectricBike;
import model.enums.BasicTypeEnum;
import model.enums.ProductTypeEnum;

public class Speedelec extends AbstractElectricBike {

    public Speedelec(ProductTypeEnum productType, String brand, int weightOfTheBike, boolean isLigths, String color, int price, int maxSpeed, int batteryCapacity) {
        super(productType, brand, weightOfTheBike, isLigths, color, price, maxSpeed, batteryCapacity);
    }
}
