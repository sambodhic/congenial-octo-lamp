package com.congenial.octo.lamp.leetcode;

import java.util.*;

public class Lc252_MeetingRooms {

    static int[][] intervals = { { 0, 6 }, { 5, 10 }, { 15, 20 } };

    public static void main(String[] args) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        boolean conflict = false;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                conflict = true;
                break;
            }
        }
        System.out.println("Confict? " + conflict);
    }

}
