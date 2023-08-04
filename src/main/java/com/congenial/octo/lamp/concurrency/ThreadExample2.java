package com.congenial.octo.lamp.concurrency;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.start();
    }
    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Start");
        }
    }
}
