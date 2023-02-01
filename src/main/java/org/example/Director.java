package org.example;

/**
 * Директор определяет какую CarBuilder создавать
 */
public class Director {
    CarBuilder carbuilder;

    public void setCarbuilder(CarBuilder carbuilder) {
        this.carbuilder = carbuilder;
    }

    Car buildCar() {
        carbuilder.createCar();
        carbuilder.buildCarBrand();
        carbuilder.buildMaxSpeed();
        return carbuilder.getCar();
    }
}
