package com.aksha.java.streams;


import com.aksha.beans.*;
import java.util.*;

public class StreamCreationExt {
    public static void main(String[] args) {

        List<Double> taxRate = Arrays.asList(12.5, .75, .75, .75, 4.5, 7.0);
        System.out.println(taxRate);

        System.out.println("--- Intermediate Operatoins (distinct) ---");
        taxRate.stream().distinct().forEach(System.out::println);  //returns the distinct values

        System.out.println("--- Intermediate Operatoins (limit) ---");
        taxRate.stream().limit(2).forEach(System.out::println);  //returns the limited number of elements

        System.out.println("--- Intermediate Operatoins (map) ---");
        taxRate.stream().map(t -> t + .6).forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Sonu",    Department.EDABI, "BigRed", "India"),
                new Employee(2, "Libin",   Department.EDABI, "Item",   "India"),
                new Employee(3, "Anil",    Department.EDABI, "Item",   "US")
        );
        employees.forEach(System.out :: println);
        System.out.println("After sorting");
        employees.stream().sorted((emp1,emp2)-> emp1.getEmpName().compareTo(emp2.getEmpName())).forEach(System.out :: println);
        System.out.println("With methode reference");
        employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out :: println);

    }
}
