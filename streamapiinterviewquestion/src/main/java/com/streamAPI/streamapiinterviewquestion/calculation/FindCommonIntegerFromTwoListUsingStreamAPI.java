package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindCommonIntegerFromTwoListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1 = Arrays.asList(4,5,6,7,8,9);
        List<Integer> list2 = list.stream().filter(list1::contains).toList();
        System.out.println(list2);
    }
}
