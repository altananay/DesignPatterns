package main;

import java.math.BigDecimal;

public class NewCustomerProductBuilder extends ProductBuilder{

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
        product.discountedPrice = BigDecimal.valueOf(product.unitPrice.doubleValue()).multiply(BigDecimal.valueOf(0.90));
        product.discountApplied = true;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
