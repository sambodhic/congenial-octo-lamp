package com.congenial.octo.lamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;

public class ArrayDemo {

    public static void main(String[] args) {
        out("******************");
        string_array();
        character_array();
        multi_array();
        string_int();
        array_list();
        linked_list();
        hash_map();
        stack_();
    }

    static void out(String s) {
        System.out.println(s);
    }

    static void string_array() {
        String[] cars = { "toyota", "lexus", "acura", "tesla", "porsche" };
        out(Arrays.toString(cars));

        out("\nSorted items");
        Arrays.sort(cars);
        out(Arrays.toString(cars));

        out("\nReverse order");
        Arrays.sort(cars, Collections.reverseOrder());
        out(Arrays.toString(cars));

        out("\nLoop1");
        for (String string : cars) {
            out(string);
        }

        out("\nLoop2");
        for (int i = 0; i < cars.length; i++) {
            out(cars[i]);
        }
    }

    static void character_array() {
        String s = "test";
        Character[] ch = new Character[4];
        char[] ch1 = new char[4];
        char[] ch2 = s.toCharArray();

        out(Arrays.toString(ch));
        out(Arrays.toString(ch1));
        out(Arrays.toString(ch2));

    }

    static void multi_array() {
        int[][] num = { { 1, 2, 35, 6, 74, 9 },
                { 5, 3, 4, 22, 3, 5 } };

        int[][] num2 = new int[4][6];

        out("\nlook through multi-dimensional");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                out(i + "," + j + " - " + Integer.toString(num[i][j]));
                num2[i + 1][j] = num[i][j];
            }
        }

        System.out.println(Arrays.deepToString(num2));
    }

    static void string_int() {

        int i = 9, i2;
        Integer j = 8, j2;
        String s = "7", s2;

        // s2 = Integer.toString(i);
        out("\nint -> String");
        s2 = Integer.toString(i);
        out(s2);

        out("\nInteger -> String");
        s2 = Integer.toString(j);
        out(s2);

        out("\nString -> int");
        i2 = Integer.parseInt(s);
        out(Integer.toString(i2));

        out("\nString -> Integer");
        j2 = Integer.parseInt(s);
        out(Integer.toString(j2));

    }

    static void array_list() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }

    static void linked_list() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        out(cars.getFirst());
        out(cars.getLast());
        out(cars.peek());
        out(cars.pollLast());
    }

    static void hash_map(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);        

        for(String s: capitalCities.values()){
            out(s);
        }
        for(String s: capitalCities.keySet()){
            out(s+", "+capitalCities.get(s));
        }

    }

    static void stack_(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(11);
        stack.push(21);
        stack.push(31);
        stack.push(41);
        stack.push(5);
        stack.add(5, 6);
        stack.add(6, 7);
        out(Integer.toString(stack.peek()));
        out(Integer.toString(stack.search(6)));
        stack.pop();
        out(Integer.toString(stack.search(6)));
        
        for(Integer i: stack){
            out(""+i);
        }
    }



}
