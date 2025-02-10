package com.congenial.octo.lamp.leetcode;

public class Lc0070_ClimbingStairs {
    static int stairs = 5;

    public static void main(String[] args) {
        int[] out = new int[stairs + 1];
        out[0] = 1;
        out[1] = 1;
        for (int i = 1; i < stairs; i++) {
            out[i + 1] = out[i - 1] + out[i];
        }
        System.out.println(out[stairs]);
    }

}
