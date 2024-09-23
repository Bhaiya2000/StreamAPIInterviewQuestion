package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumberFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumber = list.stream().filter(i-> i%2 == 0).toList();
        System.out.println(evenNumber);
    }
}
