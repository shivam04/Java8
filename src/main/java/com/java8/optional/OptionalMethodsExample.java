package com.java8.optional;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) {
        Optional<String> ofNullable = Optional.ofNullable("JAVA8");
        Optional<String> ofNullable1 = Optional.ofNullable(null);
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
        System.out.println(ofNullable1.isPresent() ? ofNullable1.get() : Optional.empty());

        Optional<String> of = Optional.of("Hello");
        //Optional<String> of1 = Optional.of(null); -> gives exception
        System.out.println(of.isPresent() ? of.get() : Optional.empty());
        //System.out.println(of1.isPresent() ? of1.get() : Optional.empty());

        System.out.println(Optional.empty());
    }
}
