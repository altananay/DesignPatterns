namespace Proxy;

public class CreditManagerProxy : CalculatorBase
{
    private CreditManager _creditManager;
    private double _cachedValue = 0;

    public override double Calculate()
    {
        if (_creditManager == null)
        {
            _creditManager = new CreditManager();
            _cachedValue = _creditManager.Calculate();
        }

        return _cachedValue;
    }
}