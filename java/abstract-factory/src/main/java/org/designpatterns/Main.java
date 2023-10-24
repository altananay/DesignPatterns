package org.designpatterns;

public class Main {
  public static void main(String[] args) {
    ProductManager productManager = new ProductManager(new AlternativeFactory());
    productManager.getAll();
  }
}
