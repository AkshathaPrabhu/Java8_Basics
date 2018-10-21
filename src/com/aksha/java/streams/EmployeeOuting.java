package com.aksha.java.streams;

import com.aksha.beans.*;
import java.util.*;
import java.util.stream.*;

/**
 * Created by z002959 on 11/14/17.
 */
public class EmployeeOuting {

    public static void main(String[] args) {
        // 1. Get TTS dept employees
        // 2. From that OMS project employees
        // 3. From 2. get all ppl in india
        // 4. only get their employee name
        // 5. Sort the names in ascending order

        System.out.println("--- By Traditional Approach --");
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println("Num. of employees : " + employees.size());

        List<Employee> ttsEmployees = getTTSEmployees(employees);
        System.out.println("Num. of TTS employees : " + ttsEmployees.size());

        List<Employee> omsEmployees = getOMSEmpFromTTS(ttsEmployees);
        System.out.println("Num. of OMS employees : " + omsEmployees.size());

        List<Employee> indiaEmployees = getIndianEmpFromOMS(omsEmployees);
        System.out.println("Num. of Indian employees : " + indiaEmployees.size());

        List<String> nameOfEmployees = getNameOfIndianEmp(indiaEmployees);
        System.out.println("Name. of Indian employees : " + nameOfEmployees);

        List<String> sortedEmployees = getSortedEmployees(nameOfEmployees);
        sortedEmployees.forEach(System.out::println);


        getAscendingOrderListWithStream(nameOfEmployees);
//        System.out.println("Name. of Indian employees : " + sortedNames);


        System.out.println("--- By Stream Approach --");

        Stream<String> empAsStream = employees.stream().parallel()
                .filter(emp -> emp.getDept().equals(Department.TTS))
                .filter(emp -> emp.getProjectName().equals("OMS"))
                .filter((emp -> emp.getLocation().equals("India")))
                .map(emp -> emp.getEmpName())
                .sorted();
//                .forEach(System.out::println);

        System.out.println(empAsStream.collect(Collectors.toList()));

        // collect is used to change stream to list

       /*
        // for debugging these streams use 'peak' method
        employees.stream()
                .filter(emp -> emp.getDept().equals(Department.TTS)).peek(a -> System.out.println("1st itr"))
                .filter(emp -> emp.getProjectName().equals("OMS")).peek(a -> System.out.println("2nd itr"))
                .filter((emp -> emp.getLocation().equals("India"))).peek(a -> System.out.println("3rd itr"))
                .map(emp -> emp.getEmpName()).peek(a -> System.out.println("4th itr"))
                .sorted().peek(a -> System.out.println("5th itr"))
                .forEach(System.out::println);
        */
    }

    private static List<String> getSortedEmployees(List<String> nameOfEmployees) {
        Set<String> sortedList = new TreeSet<>();
        for (String emp : nameOfEmployees) {
            {
                sortedList.add(emp);
            }
        }
        return new ArrayList<>(sortedList);

    }

    private static void getAscendingOrderListWithStream(List<String> nameOfEmployees) {
        nameOfEmployees.stream().sorted().forEach(System.out::println);

    }

    private static List<String> getNameOfIndianEmp(List<Employee> indiaEmployees) {
        List<String> nameOfEmployees = new ArrayList<>();
        for (Employee emp : indiaEmployees) {
            {
                nameOfEmployees.add(emp.getEmpName());
            }
        }
        return nameOfEmployees;

    }

    private static List<Employee> getIndianEmpFromOMS(List<Employee> omsEmployees) {
        List<Employee> indianEmployees = new ArrayList<>();
        for (Employee emp : omsEmployees) {
            if (emp.getLocation().equals("India")) {
                indianEmployees.add(emp);
            }
        }
        return indianEmployees;

    }


    private static List<Employee> getOMSEmpFromTTS(List<Employee> employees) {
        List<Employee> omsEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getProjectName().equals("OMS")) {
                omsEmployees.add(emp);
            }
        }
        return omsEmployees;

    }

    private static List<Employee> getTTSEmployees(List<Employee> employees) {
        List<Employee> ttsEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDept() == Department.TTS) {
                ttsEmployees.add(emp);
            }
        }
        return ttsEmployees;
    }


}
