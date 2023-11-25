package main;

public class CustomerManager {

    private Logger logger;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public void save()
    {
        System.out.println("saved");
        logger.log();
    }
}
