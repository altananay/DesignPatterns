package main;

public class CarDecoratorBase extends CarBase{
    private final CarBase carBase;

    protected CarDecoratorBase(CarBase carBase)
    {
        this.carBase = carBase;
    }
}