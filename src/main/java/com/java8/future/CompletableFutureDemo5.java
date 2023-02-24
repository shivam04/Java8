package com.java8.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo5 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");
        CompletableFuture<Void> combineFuture = CompletableFuture.allOf(future1, future2, future3);
        combineFuture.get();
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}
