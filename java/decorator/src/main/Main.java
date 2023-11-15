package main;

public class Main {
  public static void main(String[] args) {
    var personelCar = new PersonalCar();
    personelCar.brandName = "bmw";
    personelCar.HirePrice = 5000;
    personelCar.model = "m5";

    SpecialOffer specialOffer = new SpecialOffer(personelCar);
    specialOffer.discountPercentage = 10;
    System.out.println("Without special offer: " + personelCar.HirePrice);
    System.out.println("Special offer: " + specialOffer.getHirePrice());
  }
}
