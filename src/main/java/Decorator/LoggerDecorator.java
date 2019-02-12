package Decorator;

public class LoggerDecorator implements Logger {
    Logger logger;

    public LoggerDecorator(Logger logger) {
        super();
        this.logger = logger;
    }

    public void log(String msg) {
        logger.log(msg);
    }
}