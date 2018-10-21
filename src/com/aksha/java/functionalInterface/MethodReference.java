package com.aksha.java.functionalInterface;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;
import jdk.nashorn.internal.ir.*;

/**
 * Created by z002959 on 11/13/17.
 */
public class MethodReference {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Bangalore", "Delhi");
        System.out.println("--- All Elements ---");
        System.out.println(cities);

        System.out.println("\n--- All Elements in Uppercase ---");
        upperCase(cities);

        System.out.println("\n--- All Elements in Lowercase using Method Reference ---");
        someCase(cities, String::toLowerCase);

        System.out.println("\n--- All Elements from Method Reference ---");
        cities.forEach(System.out::println);  //newest forEach : internal iteration
        //cities.stream().forEach(System.out::println);  //will give additional functionality like filter,


        System.out.println("\n--- All Elements with -City using Method Reference ---");
        cities.forEach(MethodReference::addCityString);
        cities.forEach(val -> addCityString(val)); //same as above statement

    }

    static void addCityString(String city) {
        System.out.println(city.concat("-City"));
    }

    static void someCase(List<String> cities, Function<String, String> toConvert) {
        for (String city : cities) {
            System.out.println(toConvert.apply(city));
        }
    }

    static void upperCase(List<String> cities) {
        for (String city : cities) {
            System.out.println(city.toUpperCase());   //external iteration forEach , takes more time than internal iteration
        }
    }
}

