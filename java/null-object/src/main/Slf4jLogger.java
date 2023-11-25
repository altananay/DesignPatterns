package main;

public class Slf4jLogger implements Logger{
    @Override
    public void log() {
        System.out.println("logged with slf4j logger");
    }
}