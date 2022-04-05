package com.github.ivan100kg.stepikjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hw621 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>();
        for (T el : set1) {
            if (!set2.contains(el))
                result.add(el);
        }
        for (T el : set2) {
            if (!set1.contains(el))
                result.add(el);
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));
        System.out.println(symmetricDifference(set1, set2));
    }
}
