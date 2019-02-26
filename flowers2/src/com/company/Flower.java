package com.company;


public class Flower {


    protected double price;
    protected String color;
    protected String name;

    public Flower(double price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return "Price:"+ this.price+ ".Color:"+this.color+".Name:"+this.name;
    }



}
