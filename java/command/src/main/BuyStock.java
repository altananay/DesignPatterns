package main;

public class BuyStock implements Order{

    private StockManager _manager;

    public BuyStock(StockManager manager)
    {
        _manager = manager;
    }

    @Override
    public void Execute() {
        _manager.Buy();
    }
}