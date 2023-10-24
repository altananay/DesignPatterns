namespace AbstractFactory;

public abstract class CrossCuttingConcernFactory
{
    public abstract Logging CreateLogger();
    public abstract Caching CreateCaching();
}