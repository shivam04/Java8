package com.java8.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo3 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World");
        System.out.println(future.get());


        CompletableFuture<String> completableFuture1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<Void> future1 = completableFuture1
                .thenAccept(s -> System.out.println("Computation returned: " + s));
        System.out.println(future1.get());

        CompletableFuture<String> completableFuture2
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<Void> future2 = completableFuture2
                .thenRun(() -> System.out.println("Computation finished."));
        System.out.println(future2.get());

    }
}
