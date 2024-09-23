package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllIntegerInGivenList {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> sumOfAllInteger = listOfInteger.stream().reduce(Integer :: sum);
        System.out.println(sumOfAllInteger.get());
    }
}
