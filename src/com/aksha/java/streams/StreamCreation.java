package com.aksha.java.streams;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {
//        Stream<String> names = Stream.of("Something","Someone" ,"Dude","Huh");
////        System.out.println(names.count());
//        names.skip(2).forEach(System.out::println);


        List<Integer> values = Arrays.asList(10, 14, 34, 56);
//        values.stream().skip(2).forEach(System.out::println);
//        System.out.println(values.stream().count());

     /*   values.stream().filter(val -> val >=20).forEach(System.out::println);
        values.stream().map(val -> val >=20).forEach(System.out::println);
        values.stream().map(val -> "Values are:" +val).forEach(System.out::println);
*/


        System.out.println("==== Stream Creation (of)====");
        Stream<String> names = Stream.of("Sham", "Ravi", "Giri", "Krish");
        names.forEach(System.out::println);


        // --------------- adding values to a stream  ----------
        Stream<Integer> marks = Stream.<Integer>builder().add(67).add(23).add(10).build();
        System.out.println(marks);
        marks.forEach(System.out::println);

        Stream marksSame = Stream.builder().add(67).add(23).add(10).add(true).build(); //same as above
        System.out.println(marksSame);


//        Stream empStream = Stream.generate(() -> new String[]{"KA", "Dl", "TN"});
//        Stream empStream = Stream.generate(() -> "aksha");
        Stream empStream = Stream.generate(EmployeeData::getEmployees);
       empStream.forEach(System.out::println);


    }
}
