package main;

public class Main {
  public static void main(String[] args) {
      ProductDirector productDirector = new ProductDirector();
    var builder = new OldCustomerProductBuilder();
      productDirector.generateProduct(builder);
      var product = builder.getProduct();

      System.out.println(product.categoryName);
      System.out.println(product.unitPrice);
      System.out.println(product.id);
      System.out.println(product.name);
      System.out.println(product.discountApplied);
      System.out.println(product.discountedPrice);
  }
}