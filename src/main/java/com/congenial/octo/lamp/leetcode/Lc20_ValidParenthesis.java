package com.congenial.octo.lamp.leetcode;

import java.util.*;

public class Lc20_ValidParenthesis {
    public static void main(String[] args){

        Stack<Character> st = new Stack<Character>();

        // String brac = "{[()}}}[)()({})]]}";
        String brac = "[({}{()}())]";
        // String brac = "]";


        for (Character c: brac.toCharArray()){
            if (st.isEmpty()){
                st.push(c);
            }else{
                Character top = st.peek();
                if ((top=='(' && c==')') || (top=='[' && c==']') || (top=='{' && c=='}')){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }
        System.out.println("valid? "+st.isEmpty());
    }
}
