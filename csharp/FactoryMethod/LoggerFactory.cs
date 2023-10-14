namespace FactoryMethod;

public class LoggerFactory : ILoggerFactory
{
    public ILogger CreateLogger()
    {
        //Business to decide factory
        return new AaLogger();
    }
}