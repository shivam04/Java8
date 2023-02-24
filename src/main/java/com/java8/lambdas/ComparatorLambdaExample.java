package com.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //Before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return x.compareTo(y);
            }
        };

        System.out.println("Comparator1 Java7: " + c1.compare(15, 15)); //0

        //After
        Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
        System.out.println("Comparator2 Java8: " + c2.compare(25, 15)); //1

        Comparator<Integer> c3 = (x, y) -> x.compareTo(y);
        System.out.println("Comparator3 Java8: " + c3.compare(15, 25)); //-1
    }
}
