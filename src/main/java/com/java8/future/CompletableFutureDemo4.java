package com.java8.future;

import java.util.concurrent.CompletableFuture;

/***
 * The best part of the CompletableFuture API is the ability to combine CompletableFuture instances in a chain of computation steps.
 * The thenCompose method, together with thenApply, implements the basic building blocks of the monadic pattern.
 * They closely relate to the map and flatMap methods of Stream and Optional classes, also available in Java 8.
 */
public class CompletableFutureDemo4 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));
        System.out.println(completableFuture.get());


        CompletableFuture<String> completableFuture1
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> " World"), (s1, s2) -> merge(s1, s2));

        System.out.println(completableFuture1.get());
    }

    private static String merge(String s1, String s2) {
        return s1 + s2;
    }
}
