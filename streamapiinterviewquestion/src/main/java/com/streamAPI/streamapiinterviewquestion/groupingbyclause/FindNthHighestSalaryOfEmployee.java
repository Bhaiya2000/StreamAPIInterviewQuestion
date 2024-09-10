package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

import java.util.*;
import java.util.stream.Collectors;

public class FindNthHighestSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"anand",1200.00)
                , new Employee(2,"bob",1800.00)
                , new Employee(3,"david",1000.00)
                , new Employee(4,"daniel",100.00)
                , new Employee(5,"daniel",1900.00)
                , new Employee(6,"daniel",3000.00)
                , new Employee(7,"daniel",1400.00)
                , new Employee(8,"daniel",1200.00)
        );

        // this is the way of doing ascending order and finding the lowest salary
        Employee employee = employees.stream()
                                        .sorted((a,b) -> (int) a.getSalary() - (int )b.getSalary())
                                         .skip(0)
                                            .findFirst()
                                             .get();
        System.out.println(employee.getSalary());

        // this is the way of doing descending order and finding the highest salary
        Employee employee1 = employees.stream()
                                        .sorted((a,b) -> (int) b.getSalary() - (int )a.getSalary())
                                            .skip(0)
                                                .findFirst()
                                                    .get();
        System.out.println(employee1.getSalary());

        // Another way of finding the lowest salary of Employee and it sorted as ascending order
        Employee employee2 = employees.stream()
                                        .sorted(Comparator.comparingDouble(Employee ::getSalary))
                                            .skip(0)
                                                .findFirst()
                                                    .get();
        System.out.println(employee2.getSalary());


        // Another way of finding the highest salary
        Employee employee3 = employees.stream()
                                        .sorted(Comparator.comparingDouble(Employee :: getSalary).reversed())
                                            .skip(0)
                                                .findFirst()
                                                    .get();
        System.out.println(employee3.getSalary());
    }
}
