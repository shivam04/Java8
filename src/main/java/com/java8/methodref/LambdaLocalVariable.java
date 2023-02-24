package com.java8.methodref;

import java.util.function.Consumer;

public class LambdaLocalVariable {
    static int k= 0;

    int p = 10;

    public static void main(String[] args) {
        int i = 10;
        LambdaLocalVariable lambdaLocalVariable = new LambdaLocalVariable();
        Consumer<Integer> c1 = (j) -> {
            //i++; throw error
            k=15;
            lambdaLocalVariable.p = 122;
            System.out.println("Print K:"+k);
            System.out.println("Value is :" + (i+j));
            System.out.println("Print P :" + lambdaLocalVariable.p);
        };
        c1.accept(15);
    }
}
