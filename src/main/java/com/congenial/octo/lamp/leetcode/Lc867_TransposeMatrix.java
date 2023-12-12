package com.congenial.octo.lamp.leetcode;

import java.util.Arrays;

public class Lc867_TransposeMatrix {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6}};
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(result));
    }
}
