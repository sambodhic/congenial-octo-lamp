package com.congenial.octo.lamp.leetcode;

public class Lc2472_MaxNonOverlappingPalindrome {
    public static void main(String[] args) {
        String s = "abaccdbbd";
        int k = 3;

        int start = 0, result = 0;

        for (int i=0; i< 2* s.length(); i++){
            int left = i/2;
            int right = left + i%2;

            while (left >=start && right < s.length() && s.charAt(left)== s.charAt(right)){
                if(right - left + 1 >= k){
                    result ++;
                    start = right +1;
                    break;
                }
                left--;
                right++;
            }
        }

        System.out.println(result);
    }
}
