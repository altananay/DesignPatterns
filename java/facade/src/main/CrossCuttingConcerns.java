package main;

public class CrossCuttingConcerns {

    public Logging logging;
    public Caching caching;

    public CrossCuttingConcerns()
    {
        logging = new Log();
        caching = new Cache();
    }

}
