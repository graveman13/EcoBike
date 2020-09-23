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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstarctBike object = (AbstarctBike) o;
        return this.basicType.equals(object.basicType) &&
                this.productType.equals(object.productType) &&
                this.brand.equals(object.brand) &&
                this.weightOfTheBike == object.weightOfTheBike &&
                this.isLigths == object.isLigths &&
                this.color.equals(object.color) &&
                this.price == object.price;
    }

    @Override
    public int hashCode() {
        int resual = 31;
        resual += 61 + (this.basicType == null ? 0 : this.basicType.hashCode());
        resual += 61 + (this.productType == null ? 0 : this.productType.hashCode());
        resual += 61 + (this.brand == null ? 0 : this.brand.hashCode());
        resual += 61 + this.weightOfTheBike;
        resual += 61 + (Boolean.valueOf(this.isLigths).equals(true) ? 11 : 0);
        resual += 61 + (this.color == null ? 0 : this.color.hashCode());
        resual += 61 + (this.color == null ? 0 : this.color.hashCode());
        resual += 61 + price;
        return resual;
    }
}
