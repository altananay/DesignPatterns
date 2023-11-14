namespace Adapter;

public class ProductManager
{
    private ILogger _logger;

    public ProductManager(ILogger logger)
    {
        _logger = logger;
    }

    public void Save()
    {
        _logger.Log("log data");
        Console.WriteLine("saved");
    }
}