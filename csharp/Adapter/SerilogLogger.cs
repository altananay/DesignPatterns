namespace Adapter;

public class SerilogLogger : ILogger
{
    public void Log(string message)
    {
        Console.WriteLine("Logged, {0}", message);
    }
}