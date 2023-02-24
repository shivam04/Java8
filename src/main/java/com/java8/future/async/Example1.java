package com.java8.future.async;

import java.util.concurrent.CompletableFuture;

public class Example1 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future = completableFuture
                .thenApplyAsync(s -> s + " World");
        System.out.println(future.get());
    }
}
