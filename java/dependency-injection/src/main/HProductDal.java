package main;

public class HProductDal implements ProductDal{
    @Override
    public void save() {
        System.out.println("saved with hibernate");
    }
}
