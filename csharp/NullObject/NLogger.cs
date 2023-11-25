namespace NullObject;

public class NLogger : ILogger
{
    public void Log()
    {
        Console.WriteLine("Logged with nlogger");
    }
}
