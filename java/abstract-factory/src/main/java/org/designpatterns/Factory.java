package org.designpatterns;

public class Factory extends CrossCuttingConcernFactory {
    @Override
    public Logging createLogger() {
        return new Slf4jLogger();
    }

    @Override
    public Caching createCaching() {
        return new RedisCache();
    }
}
