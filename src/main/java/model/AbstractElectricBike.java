package model;

import model.enums.BasicTypeEnum;
import model.enums.ProductTypeEnum;

public abstract class AbstractElectricBike extends AbstarctBike{
    private int maxSpeed;
    private int batteryCapacity;

    public AbstractElectricBike(ProductTypeEnum productType, String brand,
                                int weightOfTheBike, boolean isLigths, String color, int price, int maxSpeed, int batteryCapacity) {
        super(BasicTypeEnum.ELECTRICAL, productType, brand, weightOfTheBike, isLigths, color, price);
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
