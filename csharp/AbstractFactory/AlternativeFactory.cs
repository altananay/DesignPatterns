namespace AbstractFactory;

public class AlternativeFactory : CrossCuttingConcernFactory
{
    public override Caching CreateCaching()
    {
        return new MemCache();
    }

    public override Logging CreateLogger()
    {
        return new NLogger(); ;
    }
}