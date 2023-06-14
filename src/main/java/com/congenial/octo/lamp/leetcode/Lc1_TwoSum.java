package com.congenial.octo.lamp.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Lc1_TwoSum {
 
    static int[] nums = {2,7,11,15};
    static int target = 18; 
    public static void main (String[] args){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i =0; i<nums.length; i++){
            if (hm.containsKey(nums[i])){
                System.out.println(Arrays.toString(new int[]{hm.get(nums[i]),i}));
                break;
            }else{
                hm.put(target-nums[i], i);
            }
        }
    }
}
