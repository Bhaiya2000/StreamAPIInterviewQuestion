package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2,3,6,5,4,7,9,8,0);
        List<Integer> list1 = list.stream().filter(i->i%2 == 0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
