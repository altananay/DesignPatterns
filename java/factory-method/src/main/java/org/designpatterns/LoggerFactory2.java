package org.designpatterns;

public class LoggerFactory2 implements ILoggerFactory {
    public ILogger createLogger() {
        return new JavaLogger();
    }
}
