package org.designpatterns;

public class Slf4jLogger extends Logging {

    @Override
    public void Log(String data) {
        System.out.println("Slf4j ile loglandı.");
    }
}
