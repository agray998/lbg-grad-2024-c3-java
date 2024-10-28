package com.lbg.classes;

public abstract class Vehicle {
    private byte numWheels;

    public byte getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(byte num) {
        this.numWheels = num;
    }
}
