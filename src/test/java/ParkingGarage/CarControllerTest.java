package ParkingGarage;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarControllerTest {
    private CarController cc;

    @Test
    public void addTest() {
        //Arrange
        cc = new CarController();
        CarDetails carDetailsOne = new CarDetails(5, 7, "SHLOK", true);
        CarDetails carDetailsTwo = new CarDetails(5, 7, "XYZ", true);
        cc.addCars(carDetailsOne);
        cc.addCars(carDetailsTwo);
        int expectedCarsAddedLength = 2;

        // Act
        List<CarDetails> actualCarsAdded = cc.getCarDetails();

        // Assert
        assertEquals(actualCarsAdded.size(), expectedCarsAddedLength);
    }

    @Test
    public void getCarChargesTest_NoMonthlyMemebership() {
        //Arrange
        cc = new CarController();
        CarDetails carDetails = new CarDetails(5, 7, "SHLOK", false);
        cc.addCars(carDetails);
        int expectedCharges = 10;

        // Act
        int actualCharges = cc.getCarCharges("SHLOK");

        // Assert
        assertEquals(actualCharges, expectedCharges);
    }

    @Test
    public void getCarChargesTest_MonthlyMemebership() {
        //Arrange
        cc = new CarController();
        CarDetails carDetails = new CarDetails(5, 7, "SHLOK", true);
        cc.addCars(carDetails);
        int expectedCharges = 0;

        // Act
        int actualCharges = cc.getCarCharges("SHLOK");

        // Assert
        assertEquals(actualCharges, expectedCharges);
    }

    @Test
    public void getCarChargesTest_NoMonthlyMemebership_MoreThanSixHours() {
        //Arrange
        cc = new CarController();
        CarDetails carDetails = new CarDetails(1, 10, "SHLOK", false);
        cc.addCars(carDetails);
        int expectedCharges = 30;

        // Act
        int actualCharges = cc.getCarCharges("SHLOK");

        // Assert
        assertEquals(actualCharges, expectedCharges);
    }
}
