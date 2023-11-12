package main;

public class CustomerManager {
    public CrossCuttingConcerns crossCuttingConcerns;

    public CustomerManager()
    {
        crossCuttingConcerns = new CrossCuttingConcerns();
    }

    public void save()
    {
        crossCuttingConcerns.caching.cache();
        crossCuttingConcerns.logging.log();
        System.out.println("saved");
    }
}
