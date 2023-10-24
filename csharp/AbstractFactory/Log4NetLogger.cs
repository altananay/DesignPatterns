namespace AbstractFactory;

public class Log4NetLogger : Logging
{
    public override void Log(string message)
    {
        Console.WriteLine("Logged with log4net: " + message);
    }
}