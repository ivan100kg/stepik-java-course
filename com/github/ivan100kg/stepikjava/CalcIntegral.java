package com.github.ivan100kg.stepikjava;

import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h = 1e-6;
        double result = 0;
        double n = (b - a);
        for (double d = a; d < b; d += h) {
            result += f.applyAsDouble(d);
        }
        return result * h;
    }
}
