package org.designpatterns;

public class Main {
  public static void main(String[] args) {
    var singleton = CustomerManager.createAsSingleton();
    singleton.Save();
    System.out.println(singleton.hashCode());
    var singleton2 = CustomerManager.createAsSingleton();
    singleton2.Save();
    System.out.println(singleton2.hashCode());
  }
}
