package main;

public class CreditManager extends CreditBase {

    @Override
    public double calculate() throws InterruptedException {
        double result = 1;
        for (int i = 1; i < 5; i++)
        {
            result *= i;
            Thread.sleep(1000);
        }

        return result;
    }
}
