package logFramework;

import static logFramework.LogManager.buildChainOfLogger;
import static logFramework.LogManager.buildSubject;

public class Logger {

    private static Logger loggerObject;
    private static AbstractLogger chainOfLogger;

    private static LoggerSubject loggerSubject;

    private Logger() {

    }

    public static Logger getInstance() {
        if(loggerObject == null) {
            synchronized (Logger.class) {
                if(loggerObject == null) {
                    loggerObject = new Logger();
                    chainOfLogger = buildChainOfLogger();
                    loggerSubject = buildSubject();
                }
            }
        }

        return loggerObject;
    }

    private void createLog(int level, String msg) {
        chainOfLogger.logMessage(level, msg, loggerSubject);
    }

    public void info(String message) {
        createLog(1, message);
    }

    public void error(String message) {
        createLog(2, message);
    }

    public void debug(String message) {
        createLog(3, message);
    }

}
