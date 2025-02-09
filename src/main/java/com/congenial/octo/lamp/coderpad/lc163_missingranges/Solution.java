package com.congenial.octo.lamp.coderpad.lc163_missingranges;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runner.notification.*;

import static org.junit.Assert.assertEquals;

import java.util.*;

class MissingRange{

  List<List<Integer>> getGaps(int[] nums, int lower, int upper){
    ArrayList<List<Integer>> res = new ArrayList<>();
    int n = nums.length;
    if (n==0){
      res.add(Arrays.asList(lower, upper));
      return res;
    }

    if (lower<nums[0]){
      res.add(Arrays.asList(lower, nums[n]-1));
    }

    for (int i=0; i<n-1; i++){
      if (nums[i+1]-nums[i] == 1) continue;
      else {
        res.add(Arrays.asList(nums[i]+1, nums[i+1]-1));
      }
    }
    if (upper>nums[n-1]){
      res.add(Arrays.asList(nums[n-1]+1, upper));
    }

    return res;
  }
}

public class Solution {
  MissingRange mr = new MissingRange();

  @Test
  public void testGetGaps(){

    List<List<Integer>> list = new ArrayList<>();
    list.add(Arrays.asList(2, 2));
    list.add(Arrays.asList(4, 48));
    list.add(Arrays.asList(50, 73));
    list.add(Arrays.asList(75, 99));

    assertEquals(list, mr.getGaps(new int[]{0,1,3,49,74}, 0, 99));
  }

  @Test
  public void testGetGaps2(){
    List<List<Integer>> list = new ArrayList<>();
    list.add(Arrays.asList(1,1));

    assertEquals(list, mr.getGaps(new int[]{}, 1, 1));
  }

  @Test
  public void testGetGaps3(){
    List<List<Integer>> list = new ArrayList<>();

    assertEquals(list, mr.getGaps(new int[]{-1}, -1, -1));
  }
  
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Solution.class);
    for (Failure failure: result.getFailures()){
      System.out.println(failure);
    }
    System.out.println("All tests passed?: "+result.wasSuccessful());
  }

}