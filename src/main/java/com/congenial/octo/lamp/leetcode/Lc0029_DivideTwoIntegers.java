package com.congenial.octo.lamp.leetcode;

public class Lc0029_DivideTwoIntegers {

    public static void main(String[] args){
        Lc0029_DivideTwoIntegers lc = new Lc0029_DivideTwoIntegers();
        // System.out.println(lc.divide(-2147483648,-1));
        int dividend = 100, divisor = 10;
        System.out.println(1 << 2 << 3 << 4);
    }
    
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean sign=(dividend>=0)==(divisor>=0 ) ? true :false ;

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        int result=0;
        while(dividend>=divisor){
            int count=0;
            while(dividend-(divisor << 1 << count)>=0){
                count++;
            }
            result+=1<<count;
            dividend -=divisor<<count;
        }
        return sign?result: -result;
    }    
}
