package com.aksha.java.streams;

import com.aksha.beans.*;
import java.util.*;

/**
 * Created by z002959 on 11/14/17.
 */
public class ProcessorCount {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        List<Employee> emp = EmployeeData.getEmployees();
        emp.parallelStream()
                .peek(it -> System.out.println(Thread.currentThread().getName()))
                .forEach(a -> System.out.println());
    }
}
