package model.impl;

import model.AbstractMechanicalBike;
import model.enums.BasicTypeEnum;
import model.enums.ProductTypeEnum;

public class FoldingBike  extends AbstractMechanicalBike {
    public FoldingBike(ProductTypeEnum productType, String brand, int weightOfTheBike,
                       boolean isLigths, String color, int price, int sizeOfTheWheels, int numberOfGears) {
        super(productType, brand, weightOfTheBike, isLigths, color, price, sizeOfTheWheels, numberOfGears);
    }
}
