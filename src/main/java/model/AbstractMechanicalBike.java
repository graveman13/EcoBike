package model;

import model.enums.BasicTypeEnum;
import model.enums.ProductTypeEnum;

public abstract class AbstractMechanicalBike extends AbstarctBike {
    private int sizeOfTheWheels;
    private int numberOfGears;

    public AbstractMechanicalBike(ProductTypeEnum productType, String brand,
                                  int weightOfTheBike, boolean isLigths, String color, int price, int sizeOfTheWheels, int numberOfGears) {
        super(BasicTypeEnum.MECHANICAL, productType, brand, weightOfTheBike, isLigths, color, price);
        this.sizeOfTheWheels = sizeOfTheWheels;
        this.numberOfGears = numberOfGears;
    }

    public int getSizeOfTheWheels() {
        return sizeOfTheWheels;
    }

    public void setSizeOfTheWheels(int sizeOfTheWheels) {
        this.sizeOfTheWheels = sizeOfTheWheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
