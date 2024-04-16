package logFramework;

public abstract class AbstractLogger {
    int level;
    private AbstractLogger nextLoggingLevel;

    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel) {
        this.nextLoggingLevel = nextLoggingLevel;
    }

    public void logMessage(int level, String msg, LoggerSubject loggerSubject) {
        if(this.level == level) {
            dispaly(msg, loggerSubject);
        }

        if(nextLoggingLevel != null) {
            this.nextLoggingLevel.logMessage(level, msg, loggerSubject);
        }
    }

    public abstract void dispaly(String msg, LoggerSubject loggerSubject);
}
