package org.designpatterns;

public class CustomerManager {
  private static CustomerManager customerManager;

  private CustomerManager() {}

  public static CustomerManager createAsSingleton() {
    return (customerManager == null) ? customerManager = new CustomerManager() : customerManager;
  }

  public void Save() {
    System.out.println("Saved.");
  }
}
