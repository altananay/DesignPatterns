package main;

public class StockManager {
    public String _name = "Laptop";
    private int _quantity = 10;

    public void Buy()
    {
        System.out.println("Stock: " + _name + " "+  _quantity +" bought ");
    }

    public void Sell()
    {
        System.out.println("Stock: " + _name + " "+  _quantity +" sold ");
    }
}
