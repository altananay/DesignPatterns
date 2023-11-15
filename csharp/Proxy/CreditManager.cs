namespace Proxy;

public class CreditManager : CalculatorBase
{
    public override double Calculate()
    {
        int result = 1;
        for (int i = 1; i < 5; i++)
        {
            result *= i;
            Thread.Sleep(1000);
        }

        return result;
    }
}
