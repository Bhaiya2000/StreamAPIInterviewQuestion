package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestIntegerFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,8,6,5,3,2,1,8,7,8);
        int second_Max = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(second_Max);
    }
}
