package org.designpatterns;

public class AlternativeFactory extends CrossCuttingConcernFactory {
    @Override
    public Logging createLogger() {
        return new LogbackLogger();
    }

    @Override
    public Caching createCaching() {
        return new HazelcastCaching();
    }
}
