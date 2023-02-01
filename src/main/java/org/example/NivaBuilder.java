package org.example;

/**
 * Конструктор Niva
 */
public class NivaBuilder extends CarBuilder{

    /**
     * задать марку автомобиля
     */
    @Override
    void buildCarBrand() {
        car.setCarBrand("Нива");
    }

    /**
     * задать скорость автомобиля
     */
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(120);
    }
}
