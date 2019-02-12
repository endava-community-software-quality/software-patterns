package Decorator;

public class EncryptLogger extends LoggerDecorator {
    public EncryptLogger(Logger logger) {
        super(logger);
    }

    public void log(String msg) {
        msg = encrypt(msg);
        logger.log(msg);
    }

    private String encrypt(String msg) {
        return "This is an unsecure encrypted message: " + msg;
    }
}