package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallestIntegerFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,2,1,2,1,3,4,5,6,7,8,9);
        int second_Smallest = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(second_Smallest);
    }
}
