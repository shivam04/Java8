package com.java8.stream;

import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    static UnaryOperator<Integer> add = x -> x + 5;
    static BinaryOperator<Integer> add1 = (x,y) -> x + y;

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.iterate(0, add).limit(10);
        s1.forEach(System.out::println);

        Stream<Double> s2 = Stream.generate(Math::random).limit(10);
        s2.forEach(System.out::println);

        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);

        Stream<String> s3 = Stream.of("One","Two","Three","Four");
        s3.forEach(System.out::println);

        Optional<Integer> s4 = Stream.of(1,2,3,4,5).reduce(add1);
        s4.ifPresent(System.out::println);

        Integer s5 = Stream.of(1,2,3,4,5).reduce(6, add1);
        System.out.println(s5);

    }
}
