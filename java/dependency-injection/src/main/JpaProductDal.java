package main;

public class JpaProductDal implements ProductDal {

    @Override
    public void save() {
        System.out.println("saved with jpa");
    }
}