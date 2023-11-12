package main;

public class ProductDirector {
    public void generateProduct(ProductBuilder builder)
    {
        builder.getProductData();
        builder.applyDiscount();
    }
}
