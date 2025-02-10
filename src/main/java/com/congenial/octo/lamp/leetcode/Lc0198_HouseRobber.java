package com.congenial.octo.lamp.leetcode;

public class Lc0198_HouseRobber {
    static int[] houses = { 2, 7, 9, 3, 1 };

    public static void main(String[] args) {
        int[] out = new int[houses.length + 1];
        out[0] = 0;
        out[1] = houses[0];
        for (int i = 1; i < houses.length; i++) {
            out[i + 1] = Math.max(out[i], out[i - 1] + houses[i]);
        }
        System.out.println(out[houses.length]);
    }
}
