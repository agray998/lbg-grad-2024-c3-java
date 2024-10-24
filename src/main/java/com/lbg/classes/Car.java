package com.lbg.classes;

public class Car {
    public Car(String model) {
        this.setModel(model);
    }
    public Car() {
        this.make = "Unknown";
        this.setModel("Unknown");
    }
    private int speed;
    private String make;
    private CarColour colour;
    private String model;

    public int getSpeed() {
        return this.speed;
    }

    public String getMake() {
        return this.make;
    }

    public CarColour getColour() {
        return this.colour;
    }

    public void setColour(CarColour newColour) {
        this.colour = newColour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int deltaV) {
        if (deltaV > 0) {
            this.speed += deltaV;
        }
    }

    public void decelerate(int deltaV) {
        if (deltaV > 0) {
            this.speed -= deltaV;
        }
    }
}
