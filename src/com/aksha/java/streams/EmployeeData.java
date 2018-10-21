package com.aksha.java.streams;


import com.aksha.beans.*;
import java.lang.reflect.*;
import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        System.out.println("No. of employees: " + employees.size());
    }

    public static List<Employee> getEmployees() {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Sonu",    Department.EDABI, "BigRed", "India"),
                new Employee(2, "Libin",   Department.EDABI, "Item",   "India"),
                new Employee(3, "Anil",    Department.EDABI, "Item",   "US"),
                new Employee(4, "Punit",   Department.EDABI, "BigRed", "US"),
                new Employee(5, "Sushil",  Department.EDABI, "BigRed", "India"),
                new Employee(6, "Arun",    Department.TTS,   "OMS",    "India"),
                new Employee(7, "Ramesh",  Department.TTS,   "OMS",    "India"),
                new Employee(8, "Suresh",  Department.TTS,   "OMS",    "India"),
                new Employee(9, "Pavan",   Department.TTS,   "G3PO",   "India"),
                new Employee(10, "Harish", Department.TTS,   "G3PO",   "US"),
                new Employee(11, "Vineet", Department.TTS,   "OMS",    "US"),
                new Employee(12, "Deepak", Department.TTS,   "OMS",    "India"),
                new Employee(13, "Chandra",Department.TTS,   "OMS",    "India"),
                new Employee(14, "Prathap",Department.TTS,   "OMS",    "India"),
                new Employee(15, "Prateek",Department.TTS,   "OMS",    "India"),
                new Employee(16, "Chandru",Department.MERCH, "Promo",    "US"),
                new Employee(17, "Rahul",  Department.MERCH, "Pricing",  "India"),
                new Employee(18, "Sunny",  Department.MERCH, "Pricing",  "US"),
                new Employee(19, "Gupta",  Department.MERCH, "Promo",    "India"),
                new Employee(20, "Venu",   Department.MERCH, "Pricing",  "India")
        );

       /* //here is the core logic
        Employee sonu = new Employee(1, "Sonu", Department.EDABI, "BigRed", "Bangalore");
        employeeList.add(sonu);
        Employee libin = new Employee(2, "Libin", Department.EDABI, "BigRed", "Bangalore");
        employeeList.add(libin);
        Employee anil = new Employee(3, "Anil", Department.EDABI, "BigRed", "Bangalore");
        employeeList.add(anil);
        Employee punit = new Employee(4, "Punit", Department.EDABI, "BigRed", "Bangalore");
        employeeList.add(punit);
        Employee sushil = new Employee(5, "Sushil", Department.EDABI, "BigRed", "Bangalore");
        employeeList.add(sushil);

        can add this way or by Array.asList
        */


        return employeeList;


    }


}
