package com.congenial.octo.lamp.datastructures.linear;

import java.util.Arrays;
import java.util.Collections;

import com.congenial.octo.lamp.util.Utility;

public class ArrayOctos {
    
    public static void main (String[] args){

        string_array();
        character_array();
        multi_array();

    }

    static void string_array() {
        String[] cars = { "toyota", "lexus", "acura", "tesla", "porsche" };
        Utility.out(Arrays.toString(cars));

        Utility.out("\nSorted items");
        Arrays.sort(cars);
        Utility.out(Arrays.toString(cars));

        Utility.out("\nReverse order");
        Arrays.sort(cars, Collections.reverseOrder());
        Utility.out(Arrays.toString(cars));

        Utility.out("\nLoop1");
        for (String string : cars) {
            Utility.out(string);
        }

        Utility.out("\nLoop2");
        for (int i = 0; i < cars.length; i++) {
            Utility.out(cars[i]);
        }
    }

    static void character_array() {
        String s = "test";
        Character[] ch = new Character[4];
        char[] ch1 = new char[4];
        char[] ch2 = s.toCharArray();
        
        Utility.out("\nCharacter arrays");
        Utility.out(Arrays.toString(ch));
        Utility.out(Arrays.toString(ch1));
        Utility.out(Arrays.toString(ch2));

    }

    static void multi_array() {
        int[][] num = { { 1, 2, 35, 6, 74, 9 },
                { 5, 3, 4, 22, 3, 5 } };

        int[][] num2 = new int[4][6];

        Utility.out("\nLoop through multi-dimensional");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                Utility.out(i + "," + j + " - " + Integer.toString(num[i][j]));
                num2[i + 1][j] = num[i][j];
            }
        }

        Utility.out("\nString output multi-dimensional");
        Utility.out(Arrays.deepToString(num2));
    }    
}
