package com.congenial.octo.lamp.leetcode;


public class Lc33_RotatedSortedArray {
    public static void main (String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0; 
        int result = -1;
        if (nums == null || nums.length == 0 ){
            result = -1;
        }
        int left = 0; 
        int right = nums.length -1;
        while (left<right){
            int midpoint = left + (right-left)/2;
            if (nums[midpoint] > nums[right]){
                left = midpoint+1;
            }else {
                right = midpoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length-1;

        if (target >= nums[start] && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }

        while (left <= right){
            int midpoint = left + (right-left)/2;
            if (nums[midpoint] == target){
                result = midpoint;
                break;
            }else if (nums[midpoint] < target) {
                left = midpoint+1;
            } else{
                right = midpoint-1;
            }
        }        
        System.out.println(result);
    }
}