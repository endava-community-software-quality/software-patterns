package Decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();

        Logger logger = LoggerFactory.getLogger(LoggerFactory.TYPE_FILE_LOGGER);

        HTMLLogger htmlLogger = new HTMLLogger(logger);
        htmlLogger.log("A message to log");

        EncryptLogger encryptLogger = new EncryptLogger(logger);
        encryptLogger.log("A message to log");
    }
}