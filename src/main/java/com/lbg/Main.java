package com.lbg;
import com.lbg.classes.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Car bartCar = new Car();
        bartCar.setColour(CarColour.RED);
        bartCar.setMake(CarMake.HONDA);
        bartCar.setModel(CarModel.JAZZ);
        bartCar.accelerate(30, CarSpeedUnit.MPH);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(10, CarSpeedUnit.MPH);
        System.out.println(bartCar.getSpeed());
        Car lisaCar = new Car(CarModel.ASTRA, CarMake.VAUXHALL);
        lisaCar.setColour(CarColour.YELLOW);
        lisaCar.accelerate(40, CarSpeedUnit.KPH);
        System.out.println(lisaCar.getSpeed());
        int numCars = 100;
        Car[] cars = new Car[numCars];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        Random rand = new Random();
        CarColour colour;
        int r;
        for (int i = 2; i < numCars; i++) {
            cars[i] = new Car();
            r = rand.nextInt(1000);
            if (r <= 300) {
                colour = CarColour.BLACK;
            } else if (r <= 600) {
                colour = CarColour.RED;
            } else if (r <= 850) {
                colour = CarColour.BLUE;
            } else {
                colour = CarColour.YELLOW;
            }
            cars[i].setColour(colour);
        }

        int redCars, blueCars, blackCars, yellowCars;
        redCars = blueCars = blackCars = yellowCars = 0;

        for (Car currentCar : cars) {
            switch (currentCar.getColour()) {
                case RED:
                    redCars++;
                    break;
                case BLUE:
                    blueCars++;
                    break;
                case BLACK:
                    blackCars++;
                    break;
                case YELLOW:
                    yellowCars++;
                    break;
            }
        }
        System.out.printf("Red cars: %d\nBlue cars: %d\nBlack cars: %d\nYellow cars: %d\n", redCars, blueCars, blackCars, yellowCars);
    }
}









