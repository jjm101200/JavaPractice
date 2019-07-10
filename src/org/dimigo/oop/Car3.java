package org.dimigo.oop;

public class Car3 {
    //필드선언
    private String company = "현대자동차";
    private String model = "제네시스";
    private String color = "검정색";
    private int maxSpeed = 225;
    private int price = 50000000;

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car3(String company, String model, String color, int maxSpeed) {
        this(company,model,color,maxSpeed,0);
    }

    public Car3(String company, String model, String color) {
        this(company,model,color,0);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getcolor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public Car3(String company, String model, String color, int maxSpeed, int price) {
//        this.company = company;
//        this.model = model;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//        this.price = price;
//    }


}