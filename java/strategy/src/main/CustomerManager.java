package main;

public class CustomerManager {

    public CreditCalculatorBase creditCalculatorBase;

    public void saveCredit()
    {
        System.out.println("Customer manager business rules");
        creditCalculatorBase.calculate();
    }

}
