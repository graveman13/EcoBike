package model;

import model.enums.BasicTypeEnum;
import model.enums.ProductTypeEnum;

public abstract class AbstarctBike {
    private BasicTypeEnum basicType;
    private ProductTypeEnum productType;
    private String brand;
    private int weightOfTheBike;
    private boolean isLigths;
    private String color;
    private int price;

    public AbstarctBike(BasicTypeEnum basicType, ProductTypeEnum productType,
                        String brand, int weightOfTheBike, boolean isLigths, String color, int price) {
        this.basicType = basicType;
        this.productType = productType;
        this.brand = brand;
        this.weightOfTheBike = weightOfTheBike;
        this.isLigths = isLigths;
        this.color = color;
        this.price = price;
    }

    public BasicTypeEnum getBasicType() {
        return basicType;
    }

    public void setBasicType(BasicTypeEnum basicType) {
        this.basicType = basicType;
    }

    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeightOfTheBike() {
        return weightOfTheBike;
    }

    public void setWeightOfTheBike(int weightOfTheBike) {
        this.weightOfTheBike = weightOfTheBike;
    }

    public boolean isLigths() {
        return isLigths;
    }

    public void setLigths(boolean ligths) {
        isLigths = ligths;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
