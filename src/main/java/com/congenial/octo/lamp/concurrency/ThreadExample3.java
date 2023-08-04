package com.congenial.octo.lamp.concurrency;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Start");
            }  
        };
        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
