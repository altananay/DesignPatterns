namespace Decorator;

public abstract class CarBase
{
    public abstract string BrandName { get; set; }
    public abstract string Model {  get; set; }
    public abstract decimal HirePrice { get; set; }
}