namespace Facade;


public class Logging : ILogging
{
    public void Log()
    {
        Console.WriteLine("logged");
    }
}