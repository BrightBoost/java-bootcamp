package com.pluralsight.week11;

public class ExplanationConcurrency {
    public static void main(String[] args) throws InterruptedException {
        // Not the most common way to do this
        MyThread mt = new MyThread();
        System.out.println("Hello from thread: " + Thread.currentThread().threadId());
        mt.start();

        // implement the runnable interface with a lambda expression (way more common)
        Thread thread = new Thread(() -> System.out.println("Hello from thread: " + Thread.currentThread().threadId()));
        thread.start();

        // let's break things
        Counter counter = new Counter();
        Runnable task = () -> {
            for(int i = 0; i < 20000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from thread: " + Thread.currentThread().threadId());
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}