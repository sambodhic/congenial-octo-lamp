package com.congenial.octo.lamp.leetcode;

public class Lc2444_SubarrayWithFixedBounds {
    public static void main(String[] args) {
        // int[] nums = {1,3,5,2,7,5};
        int[] nums = {1,1,1,1};
        int minK = 1;
        int maxK = 1; //5;


        int lastInvalidIdx = -1; 
        int minKIdx = -1;
        int maxKIdx = -1;
        long count = 0;

        for(int i=0; i<nums.length; i++){

            if (nums[i] >= minK && nums[i] <= maxK){

                minKIdx = (nums[i] == minK)? i:minKIdx;
                maxKIdx = (nums[i] == maxK)? i:maxKIdx;

                count += Math.max( 0, Math.min(minKIdx, maxKIdx)-lastInvalidIdx);

            }else{
                lastInvalidIdx = i;
                minKIdx = -1;
                maxKIdx = -1;
            }

        }
        System.out.println(count);
    }
}
