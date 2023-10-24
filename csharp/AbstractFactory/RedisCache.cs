namespace AbstractFactory;

public class RedisCache : Caching
{
    public override void Cache(string data)
    {
        Console.WriteLine("Cached with redis cache: " + data);
    }
}