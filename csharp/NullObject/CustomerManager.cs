    namespace NullObject;

public class CustomerManager
{
    private ILogger _logger;

    public CustomerManager(ILogger logger)
    {
        _logger = logger;
    }

    public void Save()
    {
        Console.WriteLine("saved");
        _logger.Log();
    }
}
