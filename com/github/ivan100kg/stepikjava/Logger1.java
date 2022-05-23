package com.github.ivan100kg.stepikjava;

import java.util.logging.*;

public class Logger1 {
    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger(ClassA.class.getName());
        Logger LOGGER2 = Logger.getLogger(ClassB.class.getName());
        Logger LOGGER3 = Logger.getLogger(Logger1.class.getName());


        LOGGER1.setLevel(Level.ALL);
        LOGGER2.setLevel(Level.WARNING);
        Handler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());
        handler.setLevel(Level.ALL);
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false);
    }

    public static void main(String[] args) {
        configureLogging();
    }
}

class ClassA {
}

class ClassB {
}
