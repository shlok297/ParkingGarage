
package ParkingGarage;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        // when car enters
        CarController cc = new CarController();

        CarDetails carOne = new CarDetails(5, 8, "SHLOK", true);
        CarDetails carTwo = new CarDetails(1, 6, "ABC", false);
        CarDetails carThree = new CarDetails(2, 10, "DEF", false);
        CarDetails carFour = new CarDetails(3, 12, "IJK", false);

        cc.addCars(carOne);
        cc.addCars(carTwo);
        cc.addCars(carThree);
        cc.addCars(carFour);

        // Test
        System.out.println(cc.getCarCharges("SHLOK"));
        System.out.println(cc.getCarCharges("ABC"));
        System.out.println(cc.getCarCharges("DEF"));
        System.out.println(cc.getCarCharges("IJK"));
    }
}
