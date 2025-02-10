package com.congenial.octo.lamp.leetcode;

class Lc0824_GoatLatin{

    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String[] arr1 = sentence.split(" ");
        String vowels = "AEIOUaeiou";
        String lastA = "a";

        for (int i=0; i<arr1.length; i++){
            String s = arr1[i];
            if (vowels.contains(String.valueOf(s.charAt(0)))){
                s = s.concat("ma").concat(lastA);
                lastA = lastA+"a";
                arr1[i] = s;
            }else{
                s = s.substring(1).concat(s.substring(0,1)).concat("ma").concat(lastA);
                lastA = lastA+"a";
                arr1[i] = s;
            }
        }

        System.out.println(String.join(" ", arr1));
    }
}