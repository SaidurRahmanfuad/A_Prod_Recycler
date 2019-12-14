package com.saidur.prod_recycler.Model;

public class Data_sell {
    private String sellName;
    private String price;
    private int img;

    public Data_sell() {

    }

    public Data_sell(String sellName, String price, int img) {
        this.sellName = sellName;
        this.price = price;
        this.img = img;
    }

    public String getsellName() {
        return sellName;
    }

    public void setsellName(String sellName) {
        this.sellName = sellName;
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
