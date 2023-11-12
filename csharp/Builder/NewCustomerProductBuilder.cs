namespace Builder;

public class NewCustomerProductBuilder : ProductBuilder
{
    ProductModel model = new ProductModel();

    public override void ApplyDiscount()
    {
        model.DiscountedPrice = model.UnitPrice * (decimal)0.90;
        model.DiscountApplied = true;
    }

    public override void GetProductData()
    {
        model.Id = 1;
        model.CategoryName = "Teknoloji";
        model.Name = "bilgisayar";
        model.UnitPrice = 30000;
    }

    public override ProductModel GetProductModel()
    {
        return model;
    }
}