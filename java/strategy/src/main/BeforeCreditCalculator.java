package main;

public class BeforeCreditCalculator extends CreditCalculatorBase {
    @Override
    public void calculate() {
        System.out.println("Before credit calculator");
    }
}