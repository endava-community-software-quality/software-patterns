/*
 * Copyright (c) 2019 Boomi, Inc.
 */

package Decorator;

public class FileLogger implements Logger {
    public void log(String msg) {
        System.out.println("Detta ska skrivas till consolen! " + msg);
    }
}
