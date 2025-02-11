package com.congenial.octo.lamp.leetcode;

public class Lc0528_RandomPickByWeight {
private int[] idx = new int[10];

    public static void main(String[] args){
        int[] w = {1,3,4};
        Lc0528_RandomPickByWeight rm = new Lc0528_RandomPickByWeight(w);
        rm.pickIndex();
    }

    public Lc0528_RandomPickByWeight(int[] w) {
        double sum = 0.0;
        for (int i = 0; i < w.length; i++)
            sum += w[i];

        double[] dw = new double[w.length];
        for (int i = 0; i < w.length; i++)
            dw[i] = w[i] * 10 / sum;

        int k = 0;
        for (int i = 0; i < w.length; i++)
            while (k < dw[i])
                idx[k++] = i;        
    }
    
    public int pickIndex() {
        int dex = (int) (Math.random() * 10);
        return idx[dex];
    }    
}
