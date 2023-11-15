package main;

public class CreditManagerProxy extends CreditBase{

    private CreditManager creditManager;
    private double cachedValue = 0;

    @Override
    public double calculate() throws InterruptedException {
        if (creditManager == null)
        {
            creditManager = new CreditManager();
            cachedValue = creditManager.calculate();
        }

        return cachedValue;
    }
}
