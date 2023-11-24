package main;

public class Main {
  public static void main(String[] args) {
    StockManager stockManager = new StockManager();

    SellStock sellStock = new SellStock(stockManager);
    BuyStock buyStock = new BuyStock(stockManager);

    StockController stockController = new StockController();
    stockController.TakeOrder(buyStock);
    stockController.TakeOrder(sellStock);
    stockController.TakeOrder(buyStock);

    stockController.PlaceOrders();

  }
}
