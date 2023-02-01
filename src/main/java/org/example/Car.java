package org.example;

/**
 * Машина
 */
public class Car {
    private String carBrand;
    private int maxSpeed;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand: " + carBrand +
                ", maxSpeed: " + maxSpeed + "}";
    }
}
