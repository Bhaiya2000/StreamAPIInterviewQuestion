package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindStringWithLengthThreeFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("ana","shukla","sat","birsinghpur","shu");
        List<String> list1 = list.stream().filter(i-> i.length() == 3).toList();
        System.out.println(list1);
    }
}
