namespace Builder;

public class ProductDirector
{
    public void GenerateProduct(ProductBuilder builder)
    {
        builder.GetProductData();
        builder.ApplyDiscount();
    }
}