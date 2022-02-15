package com.company;

public class Vehicles {

    String modelYear = "1000";
    String band = "bmw";

    public void checkEngine(){
        System.out.println("engine is running");

    }
}

class Car extends Vehicles{
    public Car(){
        super();

}
    Car mycar = new Car();
   // mycar.checkEngine();
}