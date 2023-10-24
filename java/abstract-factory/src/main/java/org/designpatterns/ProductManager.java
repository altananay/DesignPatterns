package org.designpatterns;

public class ProductManager {
    private final CrossCuttingConcernFactory crossCuttingConcernFactory;

    private final Logging logging;
    private final Caching caching;

    public ProductManager(CrossCuttingConcernFactory crossCuttingConcernFactory) {
        this.crossCuttingConcernFactory = crossCuttingConcernFactory;
        this.logging = crossCuttingConcernFactory.createLogger();
        this.caching = crossCuttingConcernFactory.createCaching();
    }

    public void getAll()
    {
        logging.Log("product log");
        caching.Cache("product data");
        System.out.println("Products listed");
    }
}