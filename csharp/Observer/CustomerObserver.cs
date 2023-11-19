namespace Observer;

public class CustomerObserver : Observer
{
    public override void Update()
    {
        Console.WriteLine("Message to customer: Product price changed.");
    }
}