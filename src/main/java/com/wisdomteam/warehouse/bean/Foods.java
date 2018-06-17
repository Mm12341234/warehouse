package com.wisdomteam.warehouse.bean;

import java.util.Date;

public class Foods {

    private Integer foodId;
    private String foodName;
    private Integer foodTypeId;
    private Double foodPrice;
    private Integer foodNums;
    private Integer foodShelflife;
    private String foodProducer;
    private Integer foodShelvesId;
    private Integer foodHouseId;
    private Date foodStoragetime;

    public Integer getFoodId() {
        return foodId;
    }
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public Integer getFoodTypeId() {
        return foodTypeId;
    }
    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }
    public Double getFoodPrice() {
        return foodPrice;
    }
    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }
    public Integer getFoodNums() {
        return foodNums;
    }
    public void setFoodNums(Integer foodNums) {
        this.foodNums = foodNums;
    }
    public Integer getFoodShelflife() {
        return foodShelflife;
    }
    public void setFoodShelflife(Integer foodShelflife) {
        this.foodShelflife = foodShelflife;
    }
    public String getFoodProducer() {
        return foodProducer;
    }
    public void setFoodProducer(String foodProducer) {
        this.foodProducer = foodProducer;
    }
    public Integer getFoodShelvesId() {
        return foodShelvesId;
    }
    public void setFoodShelvesId(Integer foodShelvesId) {
        this.foodShelvesId = foodShelvesId;
    }
    public Integer getFoodHouseId() {
        return foodHouseId;
    }
    public void setFoodHouseId(Integer foodHouseId) {
        this.foodHouseId = foodHouseId;
    }
    public Date getFoodStoragetime() {
        return foodStoragetime;
    }
    public void setFoodStoragetime(Date foodStoragetime) {
        this.foodStoragetime = foodStoragetime;
    }

    public Foods() {
    }

    public Foods(String foodName, Integer foodTypeId) {
        this.foodName = foodName;
        this.foodTypeId = foodTypeId;
    }

    public Foods(String foodName, Integer foodTypeId, Double foodPrice,
                 Integer foodNums, Integer foodShelflife, String foodProducer,
                 Integer foodShelvesId, Integer foodHouseId, Date foodStoragetime) {
        this.foodName = foodName;
        this.foodTypeId = foodTypeId;
        this.foodPrice = foodPrice;
        this.foodNums = foodNums;
        this.foodShelflife = foodShelflife;
        this.foodProducer = foodProducer;
        this.foodShelvesId = foodShelvesId;
        this.foodHouseId = foodHouseId;
        this.foodStoragetime = foodStoragetime;
    }
}