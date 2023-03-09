public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric(){
    return electric;
  }

  public boolean isDiscountApplied(){
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut){
    if (numOut < this.getPassengers()){
      this.setPassengers(this.getPassengers() - numOut);
      return true;
    }else {
      return  false;
    }
  }


  public void applyDiscount(){
    if (!discountApplied){
      if (electric || (this instanceof Taxi && getPassengers() >= 4)){
        discountApplied = true;
        double newTollFee = this.getTollFee() * 0.5;
        this.setTollFee(newTollFee);
      }
    }
  }

  @Override
  public double calculateTollPrice(){
    if (this.getPassengers() > 4){
      return this.getTollFee() * 4;
    }else {
      return super.calculateTollPrice();
    }
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Electric?: " + electric);
    System.out.println("Discount Applied?: " + discountApplied);
    System.out.println();
  }


}