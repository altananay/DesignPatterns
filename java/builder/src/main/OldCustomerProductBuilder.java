package main;

import java.math.BigDecimal;

public class OldCustomerProductBuilder extends ProductBuilder{

    Product product = new Product();

    @Override
    public void getProductData() {
        product.id = 1;
        product.categoryName = "teknoloji";
        product.name = "bilgsayar";
        product.unitPrice = BigDecimal.valueOf(30000);
    }

    @Override
    public void applyDiscount() {
        product.discountedPrice = product.unitPrice;
        product.discountApplied = false;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
