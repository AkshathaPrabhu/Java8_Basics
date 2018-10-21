package com.aksha.annotations;

/**
 * Created by z002959 on 11/15/17.
 */
public class IntegerCheck {

    public static void main(String[] args) {
        Integer firstValue = 10;
        Integer secondValue = 20;

        if (firstValue == secondValue)
            System.out.println(".equals check");

        if(firstValue.equals(secondValue))
            System.out.println("== check");

    }
}
