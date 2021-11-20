package com.example.designparttensingleton.factoryPartternCar;

public class TestCar {
    public static void main(String[] args) {
        Car electricCar=CarFactory.getCar("electric","red",4, "Tesla",1200000000.00,"400cc",
                "50000KW","null","null");

        Car fuelCar=CarFactory.getCar("fuel","yellow",4, "VW",1500000000.00,"500cc",
                "null","null","500000");

        Car racingCar=CarFactory.getCar("racing","green",4, "Mazda",1500000000.00,"600cc",
                "null","50000","null");

        System.out.println("Factory electricCar Config::"+electricCar);
        System.out.println("Factory fuelCar Config::"+fuelCar);
        System.out.println("Factory racingCar Config::"+racingCar);
    }
}
