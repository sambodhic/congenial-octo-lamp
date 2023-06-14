package com.congenial.octo.lamp.leetcode;

public class Lc121_BestTimetoBuyAndSell {

    public static void main (String[] args){
        int[] price = {7,7,5,3,6,4,9,4,11};

        int buy  = Integer.MAX_VALUE;
        int profit = 0;
        for (int i=0; i<price.length; i++){
            if (buy>price[i]){
                buy = price[i];
            }else if (profit < price[i] - buy){
                profit = price[i] - buy;
            }
        }
        System.out.println(buy+","+(buy+profit));
    }
    
}
