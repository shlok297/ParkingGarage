package ParkingGarage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarDetailsTest {

    @Test
    public void getParkedChargesTest() {
        //Arrange
        CarDetails carDetails = new CarDetails(5, 7, "SHLOK", true);
        long expectedTime = 2;

        // Act
        long actualTime = carDetails.getParkedTime();

        // Assert
        assertEquals(actualTime, expectedTime);
    }
}
