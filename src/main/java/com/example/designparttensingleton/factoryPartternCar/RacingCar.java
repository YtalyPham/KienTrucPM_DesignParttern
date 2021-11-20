package com.example.designparttensingleton.factoryPartternCar;

public class RacingCar extends Car{
    private  String color;
    private  int seat;
    private  String company;
    private  Double price;
    private  String speed;
    private String nitro;
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
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public String getNitro() {
        return this.nitro;
    }

    public RacingCar(String color, int seat, String company, Double price, String speed, String nitro) {
        this.color = color;
        this.seat = seat;
        this.company = company;
        this.price = price;
        this.speed = speed;
        this.nitro = nitro;
    }
}
