package com.congenial.octo.lamp.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        try {
            Car car = objectMapper.readValue(json, Car.class);
            System.out.println(objectMapper.writeValueAsString(car));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
