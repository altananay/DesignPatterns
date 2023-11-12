package main;

public class Log implements Logging{
    @Override
    public void log() {
        System.out.println("Logged");
    }
}
