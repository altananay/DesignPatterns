package main;

public class StubLogger implements Logger {

    private static volatile StubLogger stubLogger;

    private StubLogger() {}

    public static StubLogger getStubLogger()
    {
        synchronized (StubLogger.class)
        {
            if (stubLogger == null)
            {
                stubLogger = new StubLogger();
            }
        }

        return stubLogger;
    }

    @Override
    public void log() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}