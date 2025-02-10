package com.congenial.octo.lamp.leetcode;

import java.util.HashMap;

public class Lc0217_ContainsDuplicate {
    static int[] in = { 1, 2, 3, 1 };

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean duplicate = false;
        for (int i : in) {
            if (hm.containsKey(i)) {
                duplicate = true;
                break;
            } else {
                hm.put(i, i);
            }
        }
        System.out.println("duplicate found: " + duplicate);
    }
}
