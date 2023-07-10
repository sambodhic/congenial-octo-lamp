package com.congenial.octo.lamp.leetcode;

public class Lc453_MinMovestoEqualArray {
    public static void main(String[] args) {
        // int[] nums = {1,2,3};
        int[] nums = {1,1,1};

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i : nums) {
            sum += i;
            min = Math.min(min, i);
        }
        System.out.println(sum - min * nums.length);
    }
}
