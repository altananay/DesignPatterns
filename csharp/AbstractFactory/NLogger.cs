namespace AbstractFactory;

public class NLogger : Logging
{
    public override void Log(string message)
    {
        Console.WriteLine("logged with nlogger: " + message);
    }
}