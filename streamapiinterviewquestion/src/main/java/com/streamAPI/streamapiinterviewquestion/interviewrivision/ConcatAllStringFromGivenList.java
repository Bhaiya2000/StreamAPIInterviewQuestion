package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatAllStringFromGivenList {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("anand","shukla","satna");
        String concatString = list.stream().collect(Collectors.joining(","));
        System.out.println(concatString);
    }
}
