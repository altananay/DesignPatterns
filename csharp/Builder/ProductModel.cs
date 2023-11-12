namespace Builder;

public class ProductModel
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string CategoryName { get; set; }
    public decimal UnitPrice { get; set; }
    public decimal DiscountedPrice { get; set; }
    public bool DiscountApplied { get; set; }
}