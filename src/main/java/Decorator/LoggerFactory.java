package Decorator;

final class LoggerFactory {
    static final String TYPE_CONSOLE_LOGGER = "console";
    static final String TYPE_FILE_LOGGER = "file";
    static Logger getLogger(String type) {
        return TYPE_CONSOLE_LOGGER.equals(type) ? new ConsoleLogger() : new FileLogger();
    }
}
