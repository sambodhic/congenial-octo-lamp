package com.congenial.octo.lamp.leetcode;

public class Lc3174_ClearDigits{
    
    public static void main(String[] args) {
        String s = "cb34";
        int charIndex = 0;
        StringBuilder sb = new StringBuilder(s);
        
        while (charIndex < sb.length()){
            if (Character.isDigit(sb.charAt(charIndex))){
                sb.deleteCharAt(charIndex);
                if (charIndex>0){
                    sb.deleteCharAt(charIndex-1); 
                }
                charIndex--;
            }else{
                charIndex++;
            }
        }
        System.out.println(sb.toString());
    }
}