package com.congenial.octo.lamp.leetcode;

import java.util.*;

public class Lc811_SubdomainVisitCount {

    public static void main(String[] org) {

        String[] cpdomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };

        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> out = new ArrayList<>();
        int cnt = 0, cnt1 = 0;
        String text = "";
        for (String s : cpdomains) {
            cnt = hm.getOrDefault(s.split(" ")[1], Integer.parseInt(s.split(" ")[0]));
            text = s.split(" ")[1];
            hm.put(text, cnt);

            for (int i = 0; i < text.split("\\.").length; i++) {
                text = text.substring(text.indexOf(".") + 1);
                cnt1 = hm.getOrDefault(text, 0);
                hm.put(text, cnt1 + cnt);
            }
        }
        for (String s : hm.keySet()) {
            out.add(hm.get(s) + " " + s);
        }
        System.out.println(out);
    }
}
