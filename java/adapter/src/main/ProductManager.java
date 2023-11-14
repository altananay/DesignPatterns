package main;

public class ProductManager {

    private final Logger logger;

    public ProductManager(Logger logger) {
        this.logger = logger;
    }

    public void save()
    {
        logger.log("log data");
        System.out.println("saved");
    }
}
