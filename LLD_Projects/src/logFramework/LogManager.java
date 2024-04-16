package logFramework;

public class LogManager {
    protected static AbstractLogger buildChainOfLogger() {
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLoggingLevel(errorLogger);
        errorLogger.setNextLoggingLevel(debugLogger);

        return infoLogger;
    }

    protected static LoggerSubject buildSubject() {
        LoggerSubject loggerSubject = new LoggerSubject();

        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        loggerSubject.addObservers(1, consoleLogger);
        loggerSubject.addObservers(2, fileLogger);
        loggerSubject.addObservers(1, consoleLogger);
        loggerSubject.addObservers(3, consoleLogger);

        return loggerSubject;
    }

}
