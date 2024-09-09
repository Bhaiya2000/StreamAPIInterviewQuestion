package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareOfEachDigitUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = list.stream().map(i-> (i*i) ).collect(Collectors.toList());
        System.out.println(list1);
    }
}
