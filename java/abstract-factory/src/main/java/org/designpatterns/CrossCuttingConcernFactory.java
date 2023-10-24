package org.designpatterns;

public abstract class CrossCuttingConcernFactory {
    public abstract Logging createLogger();
    public abstract Caching createCaching();
}