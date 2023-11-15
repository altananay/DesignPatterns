using Decorator;

var personelCar = new PersonalCar();
personelCar.BrandName = "bmw";
personelCar.HirePrice = 5000;
personelCar.Model = "M5";

SpecialOffer specialOffer = new SpecialOffer(personelCar);
specialOffer.DiscountPercentage = 10;
Console.WriteLine("Without special: " + personelCar.HirePrice);
Console.WriteLine("Special offer " + specialOffer.HirePrice.ToString());