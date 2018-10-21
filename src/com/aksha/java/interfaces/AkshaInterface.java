package com.aksha.java.interfaces;


public interface AkshaInterface {

    void greet();  // by default methods of interfaces are public abstract

    default void greetPerson(String name)
    {
        System.out.println("Hello " + name);
        ///default methods need an implementation class to be accessed in some other class.
    }

    static void welcome()
    {
        System.out.println("Welcome to new features of Interfaces...");
    }

    //so static methods do not need an implementation class to be accessed in some other class.
    //static methods can't be overriden, because static methods are created once, only when Class is loaded


}
