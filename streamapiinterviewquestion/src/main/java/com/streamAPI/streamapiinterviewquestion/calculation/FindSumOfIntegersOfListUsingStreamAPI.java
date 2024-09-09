package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSumOfIntegersOfListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // 1st way
//        Optional<Integer> sum = list.stream().reduce((a, b) -> a+b);
//        System.out.println(sum.get());

        // 2nd way
//        int sum = list.stream().reduce(0, Integer::sum);
//        System.out.println(sum);

        // 3rd way

        int sum = list.stream().reduce((a,b) -> a+b).get();
        System.out.println(sum);
    }
}
