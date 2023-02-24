package com.java8.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureDemo1 {
    static Future<String> completeAsync() throws InterruptedException {
        CompletableFuture<String> c1 = new CompletableFuture<>();
        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            c1.complete("Hello");
            return null;
        });
        return c1;
    }
    public static void main(String[] args) throws Exception {
        Future<String> future = completeAsync();
        System.out.println(future.get());
    }
}
