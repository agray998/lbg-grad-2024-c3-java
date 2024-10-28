package com.lbg.classes;
import java.lang.Math;
import java.util.Objects;

public class Car extends Vehicle {
    public Car(CarModel model, CarMake make, CarColour colour) {
        this.setModel(model);
        this.setMake(make);
        this.setColour(colour);
        this.setNumWheels((byte) 4);
    }
    public Car(CarModel model, CarMake make) {
        this(model, make, CarColour.BLACK);
    }
    public Car() {
        this(CarModel.UNKNOWN, CarMake.UNKNOWN, CarColour.BLACK);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getColour())
                .append(" ")
                .append(this.getMake())
                .append(" ")
                .append(this.getModel())
                .toString();
    }

    private CarMake make;
    private CarColour colour;
    private CarModel model;

    public CarMake getMake() {
        return this.make;
    }

    public void setMake(CarMake make) {
        if (Objects.isNull(this.getMake()) || this.getMake().equals(CarMake.UNKNOWN)) {
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
        if (Objects.isNull(this.getModel()) || this.getModel().equals(CarModel.UNKNOWN)) {
            this.model = model;
        }
    }
}
