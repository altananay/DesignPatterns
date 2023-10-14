namespace FactoryMethod;

public class LoggerFactory2 : ILoggerFactory
{
    public ILogger CreateLogger()
    {
        //Business to decide factory
        return new LogfNetLogger();
    }
}