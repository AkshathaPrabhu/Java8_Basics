package com.aksha.java.functionalInterface;

@FunctionalInterface
public interface DBInterface {

    default void dbInfo() {
        System.out.println("Database info...");
    }

    void driverName(String driverName);  // this is the SAM

    static void dbMetadata() {
        System.out.println("Database type....");
    }

//    public static void main(String[] args) {
//        dbMetadata();  // here main is now allowed in Java8 because now we can define static methods in interfaces itself;
//        DBInterface anonymous = new DBInterface(){
//            @Override
//            public void driverName() {
//
//            }
//        };
//        anonymous.dbInfo();
//    }

}
