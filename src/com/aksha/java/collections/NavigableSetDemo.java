package com.aksha.java.collections;

import java.util.*;

/*  ------------------     NavigableSet    --------------------------
 *
 * The java.util.NavigableSet interface is a subtype of the java.util.SortedSet interface.
 *
 * It behaves like a SortedSet with the exception you have navigation methods available,
 * in addition to the sorting mechanisms of the SortedSet.
 *
 */

public class NavigableSetDemo {

    public static void main(String[] args) {
        NavigableSet<String> departments =  new TreeSet<>();

        //We can even use  TreeSt<String> departments =  new TreeSet<>(); but then we won;t be able to do
        //NavigableSet<String> departments =  new HashSet<>();
        // this id DRY - don't repeat yourself, i.e. try to reuse code as much as possible
        departments.add("Engineering");
        departments.add("Marketing");
        departments.add("HR");
        departments.add("Recruitment");
        departments.add("Transportation");
        departments.add("Ops");
        departments.add("Concierge");
        System.out.println(departments);

        System.out.println(departments.first());

        System.out.println(departments.headSet("R"));
        // The headSet() method returns a view of the original NavigableSet which only contains elements that are "less than" the given element

    }
}
