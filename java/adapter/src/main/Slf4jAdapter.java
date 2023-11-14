package main;

public class Slf4jAdapter implements Logger {
    @Override
    public void log(String message) {
        Slf4jLogger slf4jLogger = new Slf4jLogger();
        slf4jLogger.log("log data");
    }
}
