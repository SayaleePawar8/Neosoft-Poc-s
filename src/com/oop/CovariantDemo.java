package com.oop;

class Vehicle {
    public String getType() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bicycle extends Vehicle {
    @Override
    public String getType() {
        return "Bicycle";
    }
}

public class CovariantDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle type: " + vehicle.getType());

        Car car = new Car();
        System.out.println("Car type: " + car.getType());

        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle type: " + bicycle.getType());
    }
}
