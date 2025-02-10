package com.congenial.octo.lamp.leetcode;

public class Lc0152_MaximumProductSubarray {
    static int[] nums = { 2, 3, -2, 4 };

    public static void main(String[] args) {
        int max = nums[0], min = nums[0], out = max;
        for (int i = 1; i < nums.length; i++) {
            int premax = max, cur = nums[i];
            max = Math.max(cur, Math.max(cur * premax, cur * min));
            min = Math.min(cur, Math.min(cur * premax, cur * min));
            out = Math.max(out, max);
        }
        System.out.println(out);
    }
}
