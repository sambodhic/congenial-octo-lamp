package com.congenial.octo.lamp.datastructures.linear;

import java.util.ArrayList;
import java.util.Collections;

import com.congenial.octo.lamp.util.Utility;

public class ArrayListOctos {

    public static void main(String[] args) {
        array_list();
    }

    static void array_list() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Utility.out("\nSorted items");
        
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            Utility.out(i);
        }

        Utility.out("\nReverse order");
        
        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        for (String i : cars) {
            Utility.out(i);
        }
    }

}
