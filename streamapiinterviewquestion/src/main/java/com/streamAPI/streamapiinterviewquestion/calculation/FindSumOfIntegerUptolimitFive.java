package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindSumOfIntegerUptolimitFive {
    public static void main(String[] args) {

        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
        int sum = list.stream().limit(4).reduce((a,b) -> a+b).get();
        System.out.println(sum);

    }
}
