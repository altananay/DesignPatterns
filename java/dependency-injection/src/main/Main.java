package main;

public class Main {
  public static void main(String[] args) {
    ProductService productService = new ProductService(new HProductDal());
    productService.save();
  }
}