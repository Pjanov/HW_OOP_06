package org.example;

public class Program {
    public static void main(String[] args) {

        Director director = new Director();
        director.setCarbuilder(new NivaBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
