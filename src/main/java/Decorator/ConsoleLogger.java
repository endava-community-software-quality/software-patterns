package Decorator;

public class ConsoleLogger implements Logger {
    public void log(String msg) {
        System.out.println("Detta ska skrivas till consolen! " + msg);
    }
}
