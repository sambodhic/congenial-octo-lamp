package com.congenial.octo.lamp.leetcode;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Lc691_StickersToSpellWords {

    public static void main(String[] args) {
        String[] stickers = {"with","example","science"};
        String target = "thehat";

        // String[] stickers = {"notice","possible"};
        // String target = "basicbasic";

        char[] arr1 = target.toCharArray();
        int cnt = 0, cnt1 = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for (int j=0; j<arr1.length; j++){
            cnt=0;
            for (int i=0; i<stickers.length; i++){
                if (stickers[i].indexOf(arr1[j]) > -1){
                    cnt++;
                    cnt1 = (int)hm.getOrDefault(stickers[i], 0);
                    hm.put(stickers[i], ++cnt1);
                }
            }
            if (cnt == 0) {
                System.out.println("impossible");
                return;
            }
        }
        System.out.println("possible");
        // System.out.println(hm);
        
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (Entry<String, Integer> entry: hm.entrySet()){
            treeMap.put(entry.getValue(), entry.getKey());
        }
        NavigableMap<Integer, String> reversedMap = treeMap.descendingMap();
        System.out.println(reversedMap);

    }    
}
