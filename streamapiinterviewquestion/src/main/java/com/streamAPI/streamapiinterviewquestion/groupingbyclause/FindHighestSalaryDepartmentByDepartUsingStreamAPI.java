package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestSalaryDepartmentByDepartUsingStreamAPI {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"anand",3000,"Java Developer"),
                new Employee(2,"ajaz",3400,"Software Engineer"),
                new Employee(3,"Anmol",3400,"Frontend Engineer"),
                new Employee(4,"Aman",3500,"Software Engineer"),
                new Employee(5,"Akash",3500,"Frontend Engineer"),
                new Employee(6,"Ambuj",4600,"Java Developer")
        );



        Map<String, Employee> map = employees.stream().
                collect(Collectors.groupingBy(Employee :: getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee :: getSalary1)),
                                emp -> emp.get())));

        for(Map.Entry<String,Employee> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue().getSalary1());
        }

    }
}
