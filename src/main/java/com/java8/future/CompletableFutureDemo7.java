package com.java8.future;

import java.util.concurrent.CompletableFuture;

/**
 * Handle Exception
 */
public class CompletableFutureDemo7 {
    public static void main(String[] args) throws Exception {
        String name = null;
        CompletableFuture<String> completableFuture
                =  CompletableFuture.supplyAsync(() -> {
            if (name == null) {
                throw new RuntimeException("Computation error!");
            }
            return "Hello, " + name;
        }).handle((s, t) -> handleException(s, t));
        System.out.println(completableFuture.get());


        CompletableFuture<String> completableFuture1 = new CompletableFuture<>();
        completableFuture1.completeExceptionally(new RuntimeException("Calculation failed!"));
        System.out.println(completableFuture1.get());
    }

    private static String handleException(String s, Throwable t) {
        System.out.println(t.getMessage());
        return s != null ? s : "Hello, Stranger!";
    }
}
