package com.congenial.octo.lamp.concurrency;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("start "+threadName);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end "+threadName);
        };

        Thread myThread1 = new Thread(runnable, "The thread 1");
        myThread1.start();

        Thread myThread2 = new Thread(runnable, "The thread 2");
        myThread2.start();
    }
}
