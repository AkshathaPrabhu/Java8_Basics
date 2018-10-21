package com.aksha.java.collections;

import java.util.*;

/* --------------------------------  COMPARABLE INTERFACE DEMO  ----------------------------------
*
* Java Comparable interface is used to order the objects of user-defined class.
* This interface is found in java.lang package and contains only one method named compareTo(Object)
*
* Comparable interface is mainly used to sort the arrays (or lists) of custom classes (i.e. user-defined Class.
* Integer,String class implements Comparable
*
*
* So in this example, Location is a class that implements Comparable
*
* -------------------------------------------------------------------------------------------------*/

public class ComparatorDemo {


    public static void main(String[] args) {

        Location blr = new Location("Bangalore", "A");
        Location bom = new Location("Mumbai", "Z");
        Location hyd = new Location("Hyderabad", "C");
        Location ahm = new Location("Ahemdabad", "D");

        Set<Location> locations = new TreeSet<>();
        locations.add(blr);
        locations.add(bom);
        locations.add(hyd);
        locations.add(ahm);
        System.out.println("Sorted on the basis of state code using Comparable interface :\n"+ locations);


    }

    static void simpleSet() {
        Set<Integer> names = new TreeSet<>();

        names.add(1);
        names.add(24);
        names.add(34);
        names.add(2);
        names.add(10);

        System.out.println(names);

    }

}



class Location implements Comparable<Location> {
    private String city;
    private String state;


    Location(String city, String state) {
        super();
        this.city = city;
        this.state = state;
    }

    @Override
    public int compareTo(Location anotherCity) {
        //overriding Comparable interface method
        return state.compareTo(anotherCity.state);
    }

    @Override
    public String toString() {
        //overriding Object class method
        return "Location{" + "city='" + city + '\'' + ", state='" + state + '\'' + '}';
    }

}

//class LocationComparator implements Comparator<Location>
//{
//
//    @Override
//    public int compare(Location loc1, Location loc2) {
//        return loc1.city.compareTo(loc2.city);
//    }
//}






