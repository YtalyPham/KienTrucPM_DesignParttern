package com.example.designparttensingleton.factoryPartternCar;



public class CarFactory {
    public static Car getCar(String type,String color, int seat, String company, Double price, String speed,
                             String battery,String nitro,String galong){
        if("electric".equalsIgnoreCase(type))
        { return new ElectricCar(color,seat,company,price,speed,battery);}
        else if("fuel".equalsIgnoreCase(type))
        { return new FuelCar(color,seat,company,price,speed,galong);}
        else if("racing".equalsIgnoreCase(type))
        { return new RacingCar(color,seat,company,price,speed,nitro);}
        else{
          return null;
            }
    }
}
