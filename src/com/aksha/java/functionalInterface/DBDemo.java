package com.aksha.java.functionalInterface;


public class DBDemo {
    public static void main(String[] args) {

        DBInterface dba = new DBInterface() {
            @Override
            public void driverName(String dbName) {
//                System.out.println("Using - PostgreSQL DB : printed via anonymous class");  // incase no param is passed in the abstract fucnt.
                System.out.println("Using - " + dbName + " DB : printed via anonymous class");
            }

        };
        dba.driverName("PostgreSQL");


//        DBInterface dbi = () -> System.out.println("Using - Mysql DB :  printed via lambda expression");
        DBInterface dbi = (String dbName) -> System.out.println("Using - " + dbName + " DB :  printed via lambda expression");
        dbi.driverName("MySql");

    }
}
