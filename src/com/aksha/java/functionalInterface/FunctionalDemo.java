package com.aksha.java.functionalInterface;


import java.util.*;
import java.util.function.*;
import jdk.nashorn.internal.ir.*;
import org.omg.CORBA.*;

public class FunctionalDemo {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(values);

        List<Integer> oddNumber = findOddNumbers(values, num -> num % 2 != 0);
        System.out.println("Segregated array with odd numbers: " + oddNumber);



//        Function<List<Integer>, List<Integer>>  checkOddNumbers = (arrayToSegregate) -> {
//            for (Integer checkValue : arrayToSegregate) {
//                List<Integer> oddNumbersInArray = new ArrayList<>();
//                if (checkValue % 2 != 0) {
//                    oddNumbersInArray.add(checkValue);
//                }
//            }
//            return  oddNumbersInArray;
//        };
//                checkOddNumbers.apply(values);


    }

    static List<Integer> findOddNumbers(List<Integer> arrayToSegregate, Predicate<Integer> toCheck) {
        List<Integer> oddNumbersInArray = new ArrayList<>();
        for (Integer numInArray : arrayToSegregate) {
            if (toCheck.test(numInArray)) {
                oddNumbersInArray.add(numInArray);
            }
        }
        return oddNumbersInArray;
    }


}
