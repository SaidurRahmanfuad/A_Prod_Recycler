package com.saidur.prod_recycler.Model;

public class Data_buy {
   private String foodName;
   private String price;
   private int img;

    public Data_buy() {

    }

    public Data_buy(String foodName, String price, int img) {
        this.foodName = foodName;
        this.price = price;
        this.img = img;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
