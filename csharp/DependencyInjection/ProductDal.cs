namespace DependencyInjection;

public class ProductDal : IProductDal
{
    public void Save()
    {
        Console.WriteLine("saved with ef");
    }
}