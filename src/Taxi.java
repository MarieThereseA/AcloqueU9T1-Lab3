public class Taxi extends Car{
    private double fareColleceted;

    public Taxi(String licencePlate, double tollFee, int passengers, boolean isElectric, double fareColleceted){
        super(licencePlate, tollFee, passengers, isElectric);
        this.fareColleceted = fareColleceted;
    }

    public double getFareCollected(){
        return fareColleceted;
    }

    public void pickupRiders(int numRiders, double farePerRider){
        this.setPassengers(this.getPassengers() + numRiders);
        fareColleceted += (farePerRider* numRiders);
        this.applyDiscount();
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        fareColleceted += ((this.getPassengers() - 1) * farePerRider);
        return super.dropOffPassengers(this.getPassengers() - 1);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fare Collected?: " + fareColleceted);
        System.out.println();
    }


}
