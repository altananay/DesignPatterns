namespace Strategy;

public class CustomerManager
{
    public CreditCalculatorBase CreditCalculatorBase { get; set; }

    public void SaveCredit()
    {
        Console.WriteLine("Customer manager business");
        CreditCalculatorBase.Calculate();
    }
}