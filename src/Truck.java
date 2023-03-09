public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate(){
    String plate = this.getLicensePlate();
    plate = plate.substring(plate.length() - 2, plate.length());
    if (hasTrailer && axles > 4){
      if(plate.equals("MX")){
        return true;
      }else {
        return false;
      }
    }else if (hasTrailer && axles <= 4){
      if(plate.equals("LX")){
        return true;
      }else {
        return false;
      }
    }else{
      return true;
    }
  }

  @Override
  public double calculateTollPrice(){
    if (hasTrailer){
      return (this.getTollFee() * axles) * 2;
    }else {
      return this.getTollFee() * axles;
    }
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Axles?: " + axles);
    System.out.println("Has Trailer?: " + hasTrailer);
    System.out.println();
  }


}