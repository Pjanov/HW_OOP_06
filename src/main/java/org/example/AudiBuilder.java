package org.example;

/**
 * Конструктор Audi
 */
public class AudiBuilder extends CarBuilder {

    /**
     * задать марку автомобиля
     */
    @Override
    void buildCarBrand() {
        car.setCarBrand("Audi");
    }

    /**
     * задать скорость автомобиля
     */
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(280);
    }
}
