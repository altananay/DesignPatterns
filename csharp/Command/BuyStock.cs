namespace Command;

public class BuyStock : IOrder
{
    private StockManager _manager;

    public BuyStock(StockManager manager)
    {
        _manager = manager;
    }

    public void Execute()
    {
        _manager.Buy();
    }
}