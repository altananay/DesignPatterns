namespace Facade;

public class CrossCuttingConcernsFacade
{
    public ILogging Logging;
    public ICaching Caching;

    public CrossCuttingConcernsFacade()
    {
        Logging = new Logging();
        Caching = new Caching();
    }
}