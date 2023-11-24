package main;

import java.util.ArrayList;
import java.util.List;

public class StockController {

    List<Order> orders = new ArrayList<>();

    public void TakeOrder(Order order)
    {
        orders.add(order);
    }

    public void PlaceOrders()
    {
        for (Order order : orders) {
            order.Execute();
        }

        orders.clear();
    }
}