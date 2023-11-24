namespace Command;

public class StockController
{
    List<IOrder> _orders = new List<IOrder>();

    public void TakeOrder(IOrder order)
    {
        _orders.Add(order);
    }

    public void PlaceOrders()
    {
        foreach (IOrder order in _orders)
        {
            order.Execute();
        }

        _orders.Clear();
    }
}