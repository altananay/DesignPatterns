namespace FactoryMethod;

public class LogfNetLogger : ILogger
{
    public void Log()
    {
        Console.WriteLine("Logged with logfnet");
    }
}