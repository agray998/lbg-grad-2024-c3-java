package com.lbg.classes;

public abstract class Vehicle {
    private byte numWheels;
    private int speed;

    public byte getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(byte num) {
        this.numWheels = num;
    }

    public int getSpeed() {
        return this.getSpeed(SpeedUnit.MPH);
    }

    public int getSpeed(SpeedUnit units) {
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

    public void accelerate(int deltaV, SpeedUnit units) {
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

    public void decelerate(int deltaV, SpeedUnit units) {
        if (deltaV > 0) {
            this.accelerate(-deltaV, units);
        }
    }
}
