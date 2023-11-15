namespace Decorator;

public class SpecialOffer : CarDecoratorBase
{
    private readonly CarBase _carBase;
    public int DiscountPercentage { get; set; }

    public SpecialOffer(CarBase carBase) : base(carBase)
    {
        _carBase = carBase;
    }

    public override string BrandName { get; set; }
    public override string Model { get; set; }
    public override decimal HirePrice { get { return _carBase.HirePrice - _carBase.HirePrice * DiscountPercentage/100; } set { } }
}