package main;

public class ProductService {
    private ProductDal productDal;

    public ProductService(ProductDal productDal) {
        this.productDal = productDal;
    }

    public void save()
    {
        productDal.save();
    }
}