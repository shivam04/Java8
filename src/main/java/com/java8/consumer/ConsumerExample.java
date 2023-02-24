package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};

        Consumer<String> con2 = (s) -> {System.out.println(s.toLowerCase());};
        con1.andThen(con2).accept("java8");
    }
}
