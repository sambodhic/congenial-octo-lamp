package com.congenial.octo.lamp.datastructures.nonlinear;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import com.congenial.octo.lamp.util.Utility;

public class HashMapOctos {
    public static void main(String[] args){
        hash_map();
    }

    static void hash_map(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        Utility.out(capitalCities);

        Utility.out("\n** Loop by Values");
        for(String s: capitalCities.values()){
            Utility.out(s);
        }

        Utility.out("\n** Loop by keys");
        for(String s: capitalCities.keySet()){
            Utility.out(s+", "+capitalCities.get(s));
        }


        // merge mapping for key USA
        String returnedValue = capitalCities.merge("USA", "DC", (oldValue,newValue)-> oldValue+" / "+newValue);
        Utility.out("\nUSA: " + returnedValue);

        Utility.out("\n** Loop by Entries");
        for(Entry<String, String> s: capitalCities.entrySet()){
            Utility.out(s);
        }


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        NavigableMap<Integer, String> reversedMap = treeMap.descendingMap();
    }
}