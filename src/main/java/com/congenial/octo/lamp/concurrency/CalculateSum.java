package com.congenial.octo.lamp.concurrency;

import java.util.Random;

public class CalculateSum {
    static int[] array = (new Random()).ints(100000).toArray();
    static int res = 0;
    static int res1 = 0;
    static int res2 = 0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i : array) {
            res += i;
        }
        ;
        System.out.println(res + " for loop took: " + (System.currentTimeMillis() - start) + " ms");

        Thread thread1 = new Thread(new myThread(0, array.length / 2));
        Thread thread2 = new Thread(new myThread(array.length / 2, array.length));

        start = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println((res1 + res2) + " thread took: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static class myThread implements Runnable {
        int start = 0, end = 0;

        public myThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (start == 0)
                    res1 += array[i];
                else
                    res2 += array[i];
            }
        }
    }
}
