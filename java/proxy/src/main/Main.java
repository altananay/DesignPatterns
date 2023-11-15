package main;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    CreditBase creditManager = new CreditManagerProxy();
    System.out.println(creditManager.calculate());
    System.out.println(creditManager.calculate());
  }
}
