package com.example.designparttensingleton.factoryPartternCar;

public abstract class Car {
    public abstract String getColor();
    public abstract int getSeat();
    public abstract String getCompany();
    public abstract Double getPrice();
    public abstract String getSpeed();
    public abstract String getBattery();
    public abstract String getGalong();
    public abstract String getNitro();


    @Override
    public String toString() {
        return "Color= " + this.getColor() + ", Seat=" + this.getSeat() + ",Company=" + this.getCompany()
                +"Price= " + this.getPrice() + ", Speed=" + this.getSpeed()+ ", Battery=" + this.getBattery()
                + ", Galong=" + this.getGalong()+ ", Nitro=" + this.getNitro();
    }
}
