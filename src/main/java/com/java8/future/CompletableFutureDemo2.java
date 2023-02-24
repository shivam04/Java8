package com.java8.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo2 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
        System.out.println(completableFuture.get());
    }
}
