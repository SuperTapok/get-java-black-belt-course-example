package org.example.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class Comparators {
    public static void main(String[] args) {
        List<Employee> employeeArr = new ArrayList<>();
        employeeArr.add(new Employee(123, 123, "ivan"));
        employeeArr.add(new Employee(124, 123, "aleg"));

        Collections.sort(employeeArr, new NameComparator());
        out.println(employeeArr);
    }
}
