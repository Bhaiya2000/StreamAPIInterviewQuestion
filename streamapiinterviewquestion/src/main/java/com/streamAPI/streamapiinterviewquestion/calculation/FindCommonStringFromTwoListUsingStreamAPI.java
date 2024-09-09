package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonStringFromTwoListUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("car","tv","fan","cooler");
        List<String> list1 = Arrays.asList("fan","cooler","fridge");
        List<String> list2 = list.stream().filter(list1::contains).collect(Collectors.toList());
        System.out.println(list2);
    }
}
