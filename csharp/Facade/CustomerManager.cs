namespace Facade;

public class CustomerManager
{
    private CrossCuttingConcernsFacade _crossCuttingConcernsFacade;

    public CustomerManager()
    {
        _crossCuttingConcernsFacade = new CrossCuttingConcernsFacade();
    }

    public void Save()
    {
        _crossCuttingConcernsFacade.Caching.Cache();
        _crossCuttingConcernsFacade.Logging.Log();
        Console.WriteLine("Saved");
    }
}