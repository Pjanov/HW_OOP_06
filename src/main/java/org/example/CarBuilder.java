package org.example;

/**
 * Строитель автомобилей
 */
abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    /**
     * задать марку автомобиля
     */
    abstract void buildCarBrand();

    /**
     * задать скорость автомобиля
     */
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}
