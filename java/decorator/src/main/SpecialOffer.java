package main;

public class SpecialOffer extends CarDecoratorBase{

    private final CarBase carBase;
    public int discountPercentage;

    protected SpecialOffer(CarBase carBase) {
        super(carBase);
        this.carBase = carBase;
    }

    public double getHirePrice()
    {
        return carBase.HirePrice - carBase.HirePrice * discountPercentage/100;
    }
}
