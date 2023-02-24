package com.java8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Java7 Thread 1");
            }
        };

        new Thread(t1).start();

        //After
        Runnable t2 = () -> {System.out.println("Java8 Thread 2");};

        new Thread(t2).start();

        Runnable t3 = () -> {
            System.out.println("Java8 Thread 3");
            System.out.println("Java8 Thread 3.1");
        };

        new Thread(t3).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Java8 Thread 4");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Java8 Thread 5");
            System.out.println("Java8 Thread 5.1");
        }).start();
    }
}
