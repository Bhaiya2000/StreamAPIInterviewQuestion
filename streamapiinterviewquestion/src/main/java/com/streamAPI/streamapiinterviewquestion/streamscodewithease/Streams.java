package com.streamAPI.streamapiinterviewquestion.streamscodewithease;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streams {
    public static void main(String[] args) {
//        // 1- Find the sum of all integers of given list
//        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
//        int sum = list.stream().reduce(Integer :: sum).get();
//        System.out.println(sum);
//
//        // 2- Find the largest number from the given list of Integer
//        List<Integer> list1 = Arrays.asList(1,2,2,3,4,8,5,6);
//        int largest = list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(0)
//                .findFirst().get();
//        System.out.println(largest);

        // 3- Given  a list of String and write a program to count the number of string that starts with a specific character using streams
//        List<Integer> list  = Arrays.asList(2,7,5,4,3,9,23,25,27,25,23,29);
//        List<Integer> list1  =  list.stream().filter(i-> i.toString().startsWith("2")).toList();
//        System.out.println(list1);

        // 4- Given a list of string and write a program to convert a list of string to upper case
//        List<String> list  =  Arrays.asList("anand","kumar","shukla","satna");
//        List<String> list1 = list.stream().map(String::toUpperCase).toList();
//        System.out.println(list1);

        // 5- Given a list of Integer and wrtie a program to  find out the list of even number from the given number
//        List<Integer> list  =  Arrays.asList(1,4,3,2,6,7,8,9,3,4,5,6);
//        List<Integer> list1 = list.stream().filter(i-> i%2 ==0).toList();
//        System.out.println(list1);

        //6 - Given a List of Integer and write a program to count of number which satisfy the even condition
//        List<Integer> list  = Arrays.asList(1,2,3,4,5,8,9,6,5,4,3,2);
//        long count = list.stream().filter(i-> i%2 == 0).count();
//        System.out.println(count);

        //7 - Write a program to find the average of list of integer
//        List<Integer> list  = Arrays.asList(1,2,3,4,5);
//        double avg = list.stream().mapToInt(i-> i).average().getAsDouble();
//        System.out.println(avg);

        // 8 - Given a list of strings, write a program to concatenate all the strings all the strings using the streams
//        List<String> list  = Arrays.asList("anand","shukla","satna");
//        String str = list.stream().collect(Collectors.joining(","));
//        System.out.println(str);

        // 9 - Given two list of Strings, write a program to  concatenate all the strings using the streams

        // 10 - Given a list of Strings, write a program to remove the duplicate element from the list
//        List<String > list = Arrays.asList("anand","shukla","anand","satna","shukla");
//        List<String> list1 = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(list1);

        // 11 - Given a list of objects, write a program to sort the objects based on a specific attribute using streams
//        List<Person> list = Arrays.asList(
//                new Person("anand","shukla",2),
//                new Person("yradeep","shukla",7),
//                new Person("varun","shukla",5)
//        );
//
//      list.stream().sorted(Comparator.comparing(Person::getFirstName)).forEach(i-> System.out.println(i.getFirstName()));

      // 12 - Given a list of Integer and write a program to check if all elements in a list satisfy a given condition ( condition -> all elemtns are even or not)

//        List<Integer> list  =  Arrays.asList(1,2,3,4,5,6);
//        boolean isEven = list.stream().allMatch(i-> i%2 ==0);
//        System.out.println(isEven);

        // 13- Given a list of Integer and write a program to double all the element of list
//        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> list1 = list.stream().map(i-> i*i).toList();
//        System.out.println(list1);

        // 14- Given a list of Integer and write a program to  find the sum of given limit
//        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8);
//        Optional<Integer> sum =  list.stream().limit(5).reduce((a, b) -> a+b);
//        System.out.println(sum.get());

        // 15 - Given a string and write a program to remove the duplicates from the String
//        String s = "anandshuklasatna";
//        StringBuilder stringBuilder = new StringBuilder();
//        s.chars().distinct().forEach(i-> {
//            stringBuilder.append((char)i);
//        });
//
//        System.out.println(stringBuilder.toString());

        // 16- Given a list of string and write a program to find the word which is start from s
//        List<String> list  = Arrays.asList("shukla","anand","satna","suma");
//        List<String> list1 = list.stream().filter(i-> i.startsWith("s")).toList();
//        System.out.println(list1);

        // 17- Given a list of String and write a program to  find the word which is starting from s and whose length is 3
//        List<String> list  = Arrays.asList("sum","satna","som","sub","anand");
//        List<String> list1 = list.stream().filter(i-> i.startsWith("s") && i.length() == 3).toList();
//        System.out.println(list1);


      /**
       * 18 - Given a list of Integer and write a program to find the square of each number and calculate
       *  the average of those numbers whose resulting square is more the 25
        */

//      List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//      double avg = list.stream().map(i-> i*i).filter(i-> i>25).mapToInt(i->i).average().getAsDouble();
//      System.out.println(avg);


/**
 * 19 - Given a string and write a program to print the occurence of each character using streams
 */

//        String s = "anandshukla";
//        String arr[] = s.split("");
//        Map<String,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);

        /**
         * 20 - Given a sentence and write a program to  find and print the frequency of each word
         */

//        String s = "Java is programming language... Java is versatile";
//        String arr[] = s.split("\\s+");
//        Map<String,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
//        System.out.println(map);


        /**
         * 21- Given Two list of Strings and write a program to find the common element from both the list
         */
//        List<String> list  = Arrays.asList("tv","fan","cooler","car");
//        List<String> list1 = Arrays.asList("fan","cooler","car");
//        List<String> list2 = list.stream().filter(list1::contains).toList();
//        System.out.println(list2);


        /**
         * 22- Given a list of names, group them by their first letter, and then count the numbers of names in each group
         */

//        String [] arr   = {"Bob", "Charlie","Amy","Bill","Anna"};
//         Map<Character,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(i->i.charAt(0),Collectors.counting()));
//        System.out.println(map);


        /**
         * 23 - Given a list, write a program to  find and print the duplicate numbers in a list if it contains multiple duplicate element
         */
//        List<Integer> list  =  Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5,6);
//        Integer[] A = list.toArray(new Integer[list.size()]);
//        List<Integer> list1  = Arrays.stream(A).collect(Collectors.groupingBy(i-> i, Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(list1);

        /**
         * 24- Given a String and write a program to find the duplicate character in the list using Java streams
         */

//        String s = "anand";
//        String arr[] = s.split("");
//        List<String> list = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
//                .stream().filter( i-> i.getValue() > 1).map(Map.Entry :: getKey).toList();
//        System.out.println(list);

        /**
         *25-  Given a String s and write a program to  find the first non- repeating character from the string
         */

//        String s = "anandshukla";
//        String arr[] = s.split("");
//        String firstNonRepeating = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().filter(i-> i.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
//        System.out.println(firstNonRepeating);

        /**
         * 26- Given a list of string and write a program to  filter and print the palindrome of strings
         */
//        List<String> list = Arrays.asList("level","ama","anand","pmp","shukla");
//        List<String> list1 = list.stream().filter(i-> i.equals(new StringBuilder(i).reverse().toString())).collect(Collectors.toList());
//        System.out.println(list1);

        /**
         * 27- Given a two array and write a program to merge in a single sorted array
         */

//        int A[] = {1,2,3,4,5};
//        int B[] = {6,7,8,9};
//        int [] mergeSortedArray = IntStream.concat(Arrays.stream(A),Arrays.stream(B)).sorted().toArray();
//        System.out.println(Arrays.toString(mergeSortedArray));


        /**
         * 28- Given a list of two string and wrtie s program to merge both the list in a single list
         */
//       List<String> list = Arrays.asList("anand","shukla","shukwah");
//       List<String> list1 = Arrays.asList("shukla","shukwah");
//       List<String> mergedList = Stream.concat(list.stream(),list1.stream()).toList();
//        System.out.println(mergedList);


        /**
         * 29- Given a list of student and write a program to find the list of students who have scored more than 70
         */
//        List<Student> list = Arrays.asList(
//                new Student("anand",60),
//                new Student("alice",40),
//                new Student("bob",71),
//                new Student("com",75),
//                new Student("sam",80)
//        );
//
//     Map<String, List<Student>> studentMap =     list.stream()
//               .collect(Collectors.groupingBy(student -> student.getMarks() > 60 ? "Pass" : "Fail"));
//
//        studentMap.forEach((key, value) -> {
//            System.out.println(key + ":");
//            value.forEach(student -> System.out.println(student.getName()+" "+student.getMarks()));
//        });

        /**
         * 30- Given a list of Strings and write a program to sort them in increasing order based on their length
         */

//        List<String> fruits = Arrays.asList("apple","banana","mango","orange","kiwi");
//        List<String> sortedList = fruits.stream().sorted(Comparator.comparingInt(String::length)).toList();
//        System.out.println(sortedList);

        /**
         * 31- Given two map and one is subset to another and write a program to find the common items in both the map
         */


        /**
         * 32-  Given a list of integer and write a program to reverse the list of integer
         */
//        List<Integer> list  = Arrays.asList(1,6,3,4,5,6);
//        List<Integer> list1 = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), i-> {
//            Collections.reverse(i);
//            return i;
//        }));
//        System.out.println(list1);


    }
}
