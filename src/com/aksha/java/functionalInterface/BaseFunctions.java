package com.aksha.java.functionalInterface;


/*  -------------  Basic Functional Interfaces   ------------------
*
* Function
* Consumer
* Supplier
* Predicate
*
*
* */

import java.time.LocalTime;
import java.util.function.*;

public class BaseFunctions {

    public static void main(String[] args) {
        Function<Integer, String> doubletIt = value -> "Double of " + value + " is : " + (value * 2);

        String result = doubletIt.apply(10);
        System.out.println("Function example: " + result);

        Consumer<String> greetNoon = name -> System.out.println("Good afternoon " + name);
        greetNoon.accept("Aksha");


        Supplier<LocalTime> timeNow = LocalTime::now;
//        Supplier<LocalTime> timeNow = () -> LocalTime.now();   // similar to above where I have used methodReference ::
        System.out.println(timeNow.get());

        Predicate<Integer> isEligible = (experience) -> experience > 5;
//        Predicate<Integer> isEligible = (experience) -> experience > 5 ? true:false;  // this is expanded form of the above line, it's obvious we will return a boolean so not necessary
        if (isEligible.test(10))
            System.out.println("You are eligible");
        else
            System.out.println("Oops! You aren't eligible");






    }

    static void greetNoon(String name) {
        // CONSUMER equivalent
        System.out.println("Good afternoon " + name);
    }

}
