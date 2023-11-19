package main;

public class Main {
  public static void main(String[] args) {
    ProductManager productManager = new ProductManager();
    productManager.attach(new CustomerObserver());
    productManager.attach(new EmployeeObserver());
    productManager.updatePrice();
  }
}