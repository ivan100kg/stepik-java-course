package com.github.ivan100kg.stepikjava;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Pseudo {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }

    public static void main(String[] args) {
        System.out.println(pseudoRandomStream(13));
    }
}
