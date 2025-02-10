package com.congenial.octo.lamp.leetcode;

import java.util.Arrays;

public class Lc0238_ProductOfArrayExceptSelf {
    static int[] in = { 1, 2, 3, 4 };

    public static void main(String[] args) {
        int[] left = new int[in.length];
        int[] right = new int[in.length];
        int[] out = new int[in.length];

        left[0] = 1;
        right[in.length - 1] = 1;

        for (int i = 0; i < in.length - 1; i++) {
            left[i + 1] = left[i] * in[i];
        }

        for (int i = in.length - 1; i > 0; i--) {
            right[i - 1] = right[i] * in[i];
        }

        for (int i = 0; i < in.length; i++) {
            out[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(out));

    }
}
