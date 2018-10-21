package com.aksha.java.functionalInterface;

import java.util.*;

/**
 * Created by z002959 on 11/13/17.
 */
public class MethodReferenceExamples {

    public static void main(String[] args) {


        List<Integer> values = Arrays.asList(2, 3, 4, 5, 6);

        int total = values.stream().reduce(MethodReferenceExamples::add).get();
        System.out.println("Total Value :" + total);

//        values.stream().reduce((a, b) -> a + b).get();
    }

    static int add(int x, int y) {
        return (x + y);
    }
}
