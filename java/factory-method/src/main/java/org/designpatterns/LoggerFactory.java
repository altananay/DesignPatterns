package org.designpatterns;

public class LoggerFactory implements ILoggerFactory {
    public ILogger createLogger() {
        return new AaLogger();
    }
}
