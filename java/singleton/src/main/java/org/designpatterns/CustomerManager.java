package org.designpatterns;

public class CustomerManager {
  private static volatile CustomerManager customerManager;

  private CustomerManager() {}

  public static CustomerManager createAsSingleton() {
    if (customerManager == null)
    {
      synchronized (CustomerManager.class)
      {
        if (customerManager == null)
        {
          customerManager = new CustomerManager();
        }
      }
    }

    return customerManager;
  }

  public void Save() {
    System.out.println("Saved.");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}
