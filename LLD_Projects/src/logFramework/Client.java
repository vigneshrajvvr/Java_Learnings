package logFramework;

public class Client {
    public static void main(String args[]) {
        Logger logger = Logger.getInstance();
        logger.info("test");
        logger.error("test1");
        logger.debug("test2");
    }
}
