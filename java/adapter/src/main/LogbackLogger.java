package main;

public class LogbackLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message + " logged with logback");
    }
}
