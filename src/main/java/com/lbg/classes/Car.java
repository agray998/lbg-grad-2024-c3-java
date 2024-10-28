package com.lbg.classes;
import java.lang.Math;

public class Car {
    public Car(CarModel model, CarMake make) {
        this.model = model;
        this.make = make;
    }
    public Car() {
        this.make = CarMake.UNKNOWN;
        this.model = CarModel.UNKNOWN;
    }
    private int speed;
    private CarMake make;
    private CarColour colour;
    private CarModel model;

    public int getSpeed() {
        return this.getSpeed(CarSpeedUnit.MPH);
    }

    public int getSpeed(CarSpeedUnit units) {
        switch (units) {
            case KPH:
                return (int) Math.floor(this.speed * 1.60);
            case MPS:
                return (int) Math.floor(this.speed * 0.45);
            case FPS:
                return (int) Math.floor(this.speed * 1.35);
            case MPH: default:
                return this.speed;
        }
    }

    public CarMake getMake() {
        return this.make;
    }

    public void setMake(CarMake make) {
        if (this.getMake().equals(CarMake.UNKNOWN)) {
            this.make = make;
        }
    }

    public CarColour getColour() {
        return this.colour;
    }

    public void setColour(CarColour newColour) {
        this.colour = newColour;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        if (this.getModel().equals(CarModel.UNKNOWN)) {
            this.model = model;
        }
    }

    public void accelerate(int deltaV, CarSpeedUnit units) {
        switch (units) {
            case KPH:
                this.speed += (int) Math.floor(deltaV / 1.60);
                break;
            case MPS:
                this.speed += (int) Math.floor(deltaV / 0.45);
                break;
            case FPS:
                this.speed += (int) Math.floor(deltaV / 1.35);
                break;
            case MPH: default:
                this.speed += deltaV;
                break;
        }
    }

    public void decelerate(int deltaV, CarSpeedUnit units) {
        if (deltaV > 0) {
            this.accelerate(-deltaV, units);
        }
    }
}
