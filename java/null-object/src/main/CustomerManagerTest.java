package main;

public class CustomerManagerTest {

    public void saveTest()
    {
        CustomerManager customerManager = new CustomerManager(StubLogger.getStubLogger());
        customerManager.save();
    }
}
