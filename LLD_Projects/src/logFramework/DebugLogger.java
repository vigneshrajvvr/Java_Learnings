package logFramework;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }
    @Override
    public void dispaly(String msg, LoggerSubject loggerSubject) {
        String message = "DEBUG : " + msg;
        loggerSubject.notifyAllObserver(3, message);
    }
}
