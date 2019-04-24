package ParkingGarage;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    List<CarDetails> carDetails = new ArrayList<>();

    public void addCars(CarDetails carDetail) {
        carDetails.add(carDetail);
    }

    public List<CarDetails> getCarDetails() {
        return this.carDetails;
    }

    public int getCarCharges(String numberPlate) {
        for (CarDetails carDetail: carDetails) {
            if((carDetail.getNumberPlate() == numberPlate) && (!carDetail.isAMonthlyMembership())) {
                return this.getPrice(carDetail.getParkedTime());
            }
        }
        return 0;
    }

    private int getPrice(long time) {
        return (time <= 6)? (int)time * 5: 30;
    }
}
