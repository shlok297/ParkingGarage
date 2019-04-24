package ParkingGarage;

public class CarDetails {
    private int inTime; // hour in
    private int outTime; // hour out
    private String numberPlate;
    private boolean hasMonthlyMembership;

    public CarDetails(int intTime,int outTime, String numberPlate, boolean hasMonthlyMembership) {
        this.inTime = intTime;
        this.outTime = outTime;
        this.numberPlate = numberPlate;
        this.hasMonthlyMembership = hasMonthlyMembership;
    }

    public long getParkedTime() {
        return outTime - inTime;
    }

    public boolean isAMonthlyMembership() {
        return this.hasMonthlyMembership;
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }

}
