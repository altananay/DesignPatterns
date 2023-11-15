namespace Strategy;

public class AfterCreditCalculator : CreditCalculatorBase
{
    public override void Calculate()
    {
        Console.WriteLine("After credit calculator");
    }
}