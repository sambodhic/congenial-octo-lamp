package com.congenial.octo.lamp.leetcode;

import java.util.Stack;

public class Lc1249_MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        s = "a)b(c)d";
        s = "))((";
        String res = "";

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                st.push(i);
            }
            if (sb.charAt(i) == ')') {
                if (st.isEmpty()) {
                    sb.setCharAt(i, '*');
                } else {
                    st.pop();
                }
            }
        }
        while (!st.isEmpty()) {
            sb.setCharAt(st.pop(), '*');
        }
        res = sb.toString().replaceAll("\\*", "");

        System.out.println(res);
    }
}
