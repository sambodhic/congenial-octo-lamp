package com.congenial.octo.lamp.leetcode;

import java.util.HashSet;

public class Lc694_DistinctIslands {
    static int[][] DIR = { { 1, 0, 'R' }, { 0, 1, 'D' }, { -1, 0, 'D' }, { 0, -1, 'U' } };

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 }, { 1, 1, 0, 1, 1 } };

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder island = new StringBuilder().append('S');
                    callBFS(grid, i, j, island);
                    hs.add(island.toString());
                }
            }
        }
        System.out.println(hs.size());
    }

    private static void callBFS(int[][] grid, int i, int j, StringBuilder island) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;

        for (int[] dir : DIR) {
            callBFS(grid, i + dir[0], j + dir[1], island.append(dir[2]));
        }
        island.append('-');
    }
}
