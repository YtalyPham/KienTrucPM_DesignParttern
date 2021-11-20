package com.example.designparttensingleton.factoryPartternCar;

public class FuelCar extends Car{
    private  String color;
    private  int seat;
    private  String company;
    private  Double price;
    private  String speed;
    private String galong;


    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSeat() {
        return this.seat;
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public String getGalong() {
        return this.galong;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public String getNitro() {
        return null;
    }

    public FuelCar(String color, int seat, String company, Double price, String speed, String galong) {
        this.color = color;
        this.seat = seat;
        this.company = company;
        this.price = price;
        this.speed = speed;
        this.galong = galong;
    }
}
