package com.aksha.java.interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        AkshaInterfaceImpl impl = new AkshaInterfaceImpl();
        impl.greetPerson("Akshatha");

        AkshaInterface.welcome();


        AkshaInterface intf = new AkshaInterface() {
            @Override
            public void greet() {

            }   // this is an Anonymous Class, and it's scope is only inside this main function.
            // So here with new keyword, the object is created but it doesn't have a reference since this is an interface and not a class.
        };
        intf.greetPerson("Aksh Prabhu");
    }
}
