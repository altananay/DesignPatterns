package main;

public class LogbackLogger implements Logger {
    @Override
    public void log() {
        System.out.println("logged with logback logger");
    }
}
