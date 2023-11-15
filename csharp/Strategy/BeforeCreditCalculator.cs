namespace Strategy;

public class BeforeCreditCalculator : CreditCalculatorBase
{
    public override void Calculate()
    {
        Console.WriteLine("before credit calculator");
    }
}