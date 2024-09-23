package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;

public class CountIntegerStartingFromTwo {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,22,25,26,28,34,34,36,38,89);
        List<Integer> filteredInteger = listOfInteger.stream().filter(i-> i.toString().startsWith("2")).toList();
        System.out.println(filteredInteger);
    }
}
