package com.aksha.java.functionalInterface;

import java.util.function.*;

/*
* UnaryOperator - operation on a single operand that produces a result of the same type ; extends Function
* BinaryOperator - operation upon two operands of the same type, result of same type
* BiFunction - Represents a function that accepts two arguments (diff. type ) and produces a result (can be diff. type)
*
* */
public class ExtendedFunctions {

    public static void main(String[] args) {
        UnaryOperator<Double> square = num -> Math.pow(num, 2);
        System.out.println("the square is " + square.apply(6.0));

        BinaryOperator<Integer> additionInt = (val1, val2) -> val1 + val2;
        int sum = additionInt.apply(3, 50);
        System.out.println("Addition of two ints by BinaryOp is " + sum);

        BiFunction<Integer, Double, String> statement = (sales, tax) -> "The tax to be paid " + sales + " is " + (tax * sales / 100);
        String output = statement.apply(23, 5.0);
        System.out.println(output);


    }
}
