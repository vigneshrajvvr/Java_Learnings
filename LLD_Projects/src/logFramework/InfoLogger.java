package logFramework;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        this.level = level;
    }
    @Override
    public void dispaly(String msg, LoggerSubject loggerSubject) {
        String message = "INFO : " + msg;
        loggerSubject.notifyAllObserver(1, message);
    }
}
