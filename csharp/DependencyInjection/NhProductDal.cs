namespace DependencyInjection;

internal class NhProductDal : IProductDal
{
    public void Save()
    {
        Console.WriteLine("saved with nh");
    }
}