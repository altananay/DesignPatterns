namespace AbstractFactory;

public class MemCache : Caching
{
    public override void Cache(string data)
    {
        Console.WriteLine("Cached with memcache: " + data);
    }
}