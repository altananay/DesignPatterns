namespace Observer;

public class ProductManager
{
    List<Observer> _observers = new List<Observer>();

    public void UpdatePrice()
    {
        Console.WriteLine("Product price changed.");
        Notify();
    }

    public void Attach(Observer observer)
    {
        _observers.Add(observer);
    }

    public void Detach(Observer observer)
    {
        _observers.Remove(observer);
    }

    private void Notify()
    {
        foreach (Observer observer in _observers)
        {
            observer.Update();
        }
    }
}