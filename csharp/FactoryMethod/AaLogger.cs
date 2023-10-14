namespace FactoryMethod;

public class AaLogger : ILogger
{
    public void Log()
    {
        Console.WriteLine("Logged with aalogger");
    }
}