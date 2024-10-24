package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        Car bartCar = new Car();
        bartCar.setColour(CarColour.RED);
        bartCar.setModel("Blah");
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar.getColour());
        System.out.println(bartCar.getModel());
        bartCar.accelerate(30);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(10);
        System.out.println(bartCar.getSpeed());
        Car lisaCar = new Car("Blah2");
        lisaCar.accelerate(40);
        System.out.println(lisaCar.getSpeed());
        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car currentCar : cars) {
            System.out.println(currentCar);
            System.out.println(currentCar.getColour());
            System.out.println(currentCar.getModel());
        }
    }
}









