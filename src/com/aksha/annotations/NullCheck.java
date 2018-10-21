package com.aksha.annotations;


import com.sun.istack.internal.*;

public class NullCheck {

    public static void main(String[] args) {
        String greetings = greetPerson("Aksha");
        System.out.println(greetings);
    }

    private static String greetPerson(String name) {
        @NotNull
        String greet = null;
        return greet;
    }

}
