package com.congenial.octo.lamp.coderpad.lc1539_kthmissingnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class Kth_MissingNumber {
    int getKth(int[] arr, int k){
        for (int n: arr){
            if (n<=k) k++;
            else break;
        }
        return k;
    }
}

public class Solution {
    Kth_MissingNumber mr = new Kth_MissingNumber();

    @Test
    public void getKthTest(){
       assertEquals(9, mr.getKth(new int[]{2,3,4,7,11}, 5));  
    }

    @Test
    public void getKthTest2(){
       assertEquals(6, mr.getKth(new int[]{1,2,3,4}, 2));  
    }

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure: result.getFailures()){
            System.out.println(failure);
        }        
        System.out.println(result.wasSuccessful());
    }
}
