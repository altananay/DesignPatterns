package org.designpatterns;

public class LogbackLogger extends Logging {
    @Override
    public void Log(String data) {
        System.out.println("Logback ile loglandı.");
    }
}
