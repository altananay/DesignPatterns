namespace AbstractFactory;

public class Factory : CrossCuttingConcernFactory
{
    public override Caching CreateCaching()
    {
        return new RedisCache();
    }

    public override Logging CreateLogger()
    {
        return new Log4NetLogger();
    }
}