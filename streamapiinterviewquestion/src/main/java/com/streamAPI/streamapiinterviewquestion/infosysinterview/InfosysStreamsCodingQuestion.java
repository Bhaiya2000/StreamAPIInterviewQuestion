package com.streamAPI.streamapiinterviewquestion.infosysinterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InfosysStreamsCodingQuestion {
    public static void main(String[] args) {
        /**
         * 1- Given  a list of Integer and write a program to check if all the elements in a list satisfy the condition
         * all integers are even
         */

//        List<Integer> list  = Arrays.asList(6,2,8,4,4,2);
//        boolean isEven = list.stream().allMatch(i-> i%2 ==0);
//        System.out.println(isEven);

        /**
         * 2- Given a list of Integer and find the sum of all even number
         */
//
//        List<Integer> list  =  Arrays.asList(1,2,3,4,4,5,6,8);
//        Optional<Integer> sum = list.stream().filter(i->i%2 ==0 ).reduce(Integer::sum);
//        System.out.println(sum.get());

        /**
         * 3- Given a list of string of words and write a program to  find the occurence of particular word in list
         */
//        List<String> list  = Arrays.asList("apple","banana","apple","orange","mango");
//        long count = list.stream().filter(i->i.startsWith("apple")).count();
//        System.out.println(count);

        /**
         * 4- Given a list of list of strings and write a program to find all the strings in a single list
         */

//        List<List<String>> list  = Arrays.asList(
//                Arrays.asList("java","springboot","hibernate"),
//                Arrays.asList("react","angular"),
//                Arrays.asList("mysql")
//        );
//        List<String> list1 = list.stream().flatMap(i->i.stream()).toList();
//        System.out.println(list1);


        /**
         * 5- Suppose, you have a person class and each Person has a list of phoneNumber. You have to extract all the phoneNumber
         * from the list of person objects into a single list of phone number using stream apis
         */

//        Person person = new Person("anand",Arrays.asList("8358834"));
//        Person person1 = new Person("pradeep",Arrays.asList("9993768592"));
//        Person person2 = new Person("varun",Arrays.asList("878684856"));
//       List<Person> persons = Arrays.asList(person, person1, person2) ;
//       List<String> list  = persons.stream().flatMap(i->i.getPhoneNumber().stream()).collect(Collectors.toList());
//       System.out.println(list);


        /**
         * 6- Find the length of each string and print it along with string using stream APIs
         */

//        List<String> fruits = Arrays.asList("apple", "orange", "banana");
//        List<String> list  = fruits.stream().map(i-> i+"-"+i.length()).toList();
//        System.out.println(list);

        /**
         * 7- Given a list of Employee and write a program to find the highest salary of Employee
         */
//
//        List<Employee> employee = Arrays.asList(
//                new Employee("anand",1000),
//                new Employee("pradeep",2000),
//                new Employee("varun",500),
//                new Employee("david",8000)
//        );

//        String emp = employee.stream().sorted(Comparator.).findFirst().get().getName();
//        System.out.println(emp);

        // Highest Salary
//       Employee employee1 = employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//               .skip(0).findFirst().get();
//        System.out.println(employee1.getSalary());
//
//        // Lowest Salary
//        Employee employee2 = employee.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).skip(0).findFirst().get();
//        System.out.println(employee2.getSalary());

        /**
         * 8- Given an array and you need to  write a program to remove the duplicates from the Array
         */
        int A[] = {1,2,3,4,3,4,3,4,5,6,5,7,8};
        List<Integer> list = Arrays.stream(A).distinct().boxed().collect(Collectors.toList());
        System.out.println(list);

        /**
         *
         */

    }
}
