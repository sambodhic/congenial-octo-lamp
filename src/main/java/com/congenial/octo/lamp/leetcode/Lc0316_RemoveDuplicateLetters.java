package com.congenial.octo.lamp.leetcode;

import java.util.Stack;

public class Lc0316_RemoveDuplicateLetters {

    public static void main(String[] args) {
        String s = "cbacdcbc";

        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }

        for (int i=0; i<s.length(); i++){
            int c = s.charAt(i)-'a';
            if (seen[c]) continue;
            while (!st.empty() && st.peek() > c && i < lastIndex[st.peek()]){
                seen[st.pop()] = false;
            }
            st.push(c);
            seen[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append((char)(st.pop()+'a'));
        }
        System.out.println(sb.reverse().toString());
    }
    
}
