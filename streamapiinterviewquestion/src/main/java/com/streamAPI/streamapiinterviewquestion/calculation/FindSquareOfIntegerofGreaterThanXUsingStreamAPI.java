package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfIntegerofGreaterThanXUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2,3,6,7,8,9,3);
        int sum = list.stream().filter(i-> i>2).reduce((a,b) -> a+b).get();
        System.out.println(sum);
    }
}
