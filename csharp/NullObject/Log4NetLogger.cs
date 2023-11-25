namespace NullObject;

public class Log4NetLogger : ILogger
{
    public void Log()
    {
        Console.WriteLine("Logged with log4net");
    }
}
