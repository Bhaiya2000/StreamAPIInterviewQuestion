package com.streamAPI.streamapiinterviewquestion.integerwithlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfListOfNumberUsingStreamAPI {
    public static void main(String[] args) {

        // 1st way of finding the sum of list of integer
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(sum.get());
    }
}
