package logFramework;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    public void dispaly(String msg, LoggerSubject loggerSubject) {
        String message = "Error : " + msg;
        loggerSubject.notifyAllObserver(2, message);
    }
}
