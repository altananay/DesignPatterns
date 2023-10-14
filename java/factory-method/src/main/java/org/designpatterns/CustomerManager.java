package org.designpatterns;

public class CustomerManager {

    private final ILoggerFactory loggerFactory;

    public CustomerManager(ILoggerFactory loggerFactory) {
        this.loggerFactory = loggerFactory;
    }

    public void save()
    {
        System.out.println("saved");
        ILogger logger = loggerFactory.createLogger();
        logger.log();
    }
}