using Builder;

ProductDirector productDirector = new ProductDirector();
var builder = new OldCustomerProductBuilder();
productDirector.GenerateProduct(builder);
var model = builder.GetProductModel();

Console.WriteLine(model.Id);
Console.WriteLine(model.Name);
Console.WriteLine(model.CategoryName);
Console.WriteLine(model.UnitPrice);
Console.WriteLine(model.DiscountedPrice);
Console.WriteLine(model.DiscountApplied);