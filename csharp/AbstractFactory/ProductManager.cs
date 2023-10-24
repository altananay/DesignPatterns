namespace AbstractFactory;

public class ProductManager
{
    private CrossCuttingConcernFactory _crossCuttingConcernFactory;

    private Logging _logging;
    private Caching _caching;

    public ProductManager(CrossCuttingConcernFactory crossCuttingConcernFactory)
    {
        _crossCuttingConcernFactory = crossCuttingConcernFactory;
        _logging = _crossCuttingConcernFactory.CreateLogger();
        _caching = _crossCuttingConcernFactory.CreateCaching();
    }

    public void GetAll()
    {
        _logging.Log("product log");
        _caching.Cache("product data");
        Console.WriteLine("Products listed.");
    }
}