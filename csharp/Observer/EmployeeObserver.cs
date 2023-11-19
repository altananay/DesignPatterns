namespace Observer;

public class EmployeeObserver : Observer
{
    public override void Update()
    {
        Console.WriteLine("Message to employee: Product price changed.");
    }
}