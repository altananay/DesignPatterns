namespace NullObject;

public class CustomerManagerTest
{
    public void SaveTest()
    {
        CustomerManager customer = new CustomerManager(StubLogger.GetLogger());
        customer.Save();
    }
}