package com.streamAPI.streamapiinterviewquestion.integerwithlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfListOfIntegerUptoLimit {
    public static void main(String[] args) {

        // 1st way
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum = list.stream().limit(5).reduce(Integer::sum);
        System.out.println(sum.get());

        // 2nd way

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum1 = list1.stream().limit(6).reduce((a,b)->a+b);
        System.out.println(sum1.get());
    }
}
