package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHighestSalaryDepartmentByDepartUsingStreamAPI {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"anand",3000.0,"Java Developer"),
                new Employee(2,"ajaz",3400.0,"Software Engineer"),
                new Employee(3,"Anmol",3400.0,"Frontend Engineer"),
                new Employee(4,"Aman",3500.0,"Software Engineer"),
                new Employee(5,"Akash",3500.0,"Frontend Engineer"),
                new Employee(6,"Ambuj",4600.00,"Java Developer")
        );

//        Employee employee = employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary))
//                                                  .skip(0).findFirst().get();
//        System.out.println(employee.getSalary());



    }
}
