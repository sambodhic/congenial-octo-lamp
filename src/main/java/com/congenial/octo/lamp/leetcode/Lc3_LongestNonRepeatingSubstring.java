package com.congenial.octo.lamp.leetcode;

import java.util.HashSet;

public class Lc3_LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String s = "pwwkjshslajkhsjhgaksjhdew";

        int a_pointer = 0, b_pointer = 0, max = 0;
        HashSet<Character> hs = new HashSet<>();

        while (b_pointer < s.length()) {
            if (hs.contains(s.charAt(b_pointer))){
                hs.remove(s.charAt(a_pointer));
                a_pointer++;
            }else{
                hs.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, b_pointer - a_pointer);
            }
        }
        System.out.println(max);
    }
}
