package org.designpatterns;

public class Main {
  public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager(new LoggerFactory2());
    customerManager.save();
  }
}
