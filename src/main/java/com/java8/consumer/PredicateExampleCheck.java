package com.java8.consumer;

import java.util.function.Predicate;

public class PredicateExampleCheck {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a) -> a > 3;
        System.out.println(predicate.test(4));
        System.out.println(predicate.negate().test(4));
    }
}
