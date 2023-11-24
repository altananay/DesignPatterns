package main;

public class SellStock implements Order{

    private StockManager _manager;

    public SellStock(StockManager manager)
    {
        _manager = manager;
    }

    @Override
    public void Execute() {
        _manager.Sell();
    }
}