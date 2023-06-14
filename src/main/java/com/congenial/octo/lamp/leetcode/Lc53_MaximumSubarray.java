package com.congenial.octo.lamp.leetcode;

public class Lc53_MaximumSubarray {

    static int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    public static void main(String[] args) {
        int max_sum = nums[0], current_sum = max_sum;
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max((nums[i] + current_sum), nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println(max_sum);
    }

}
