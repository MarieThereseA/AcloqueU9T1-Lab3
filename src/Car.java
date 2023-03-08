public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }
}