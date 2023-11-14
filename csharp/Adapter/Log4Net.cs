namespace Adapter;

public class Log4Net
{
    public void Log(string message)
    {
        Console.WriteLine("Logged with log4net, {0}", message);
    }
}