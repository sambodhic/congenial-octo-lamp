package com.congenial.octo.lamp.leetcode;

import java.util.Arrays;

public class Lc253_MeetingRooms {

    public static void main(String[] args) {
        int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        int result = 0;

        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        for (int i = 0, j = 0; i < intervals.length; i++) {
            if (ends[j] <= starts[i]) {
                j++;
            } else {
                result++;
            }
        }

        System.out.println(result);
    }

}
