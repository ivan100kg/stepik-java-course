package com.github.ivan100kg.stepikjava;

public class Hw41 {
}

class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        if (methods.length > 3)
            return methods[3].getClassName() + "#" + methods[3].getMethodName();
        return null;
    }
}

