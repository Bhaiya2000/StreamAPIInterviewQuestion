package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumberFromGivenListOfInteger {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,4,8,7,6,5,2,9);
        int secondLargest = listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);
    }
}
