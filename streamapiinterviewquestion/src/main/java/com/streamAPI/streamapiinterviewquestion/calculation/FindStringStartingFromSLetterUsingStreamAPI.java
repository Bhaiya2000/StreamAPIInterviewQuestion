package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindStringStartingFromSLetterUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("shukla","satna","anand","shiv","kumar");
        List<String> list1 = list.stream().filter(i -> i.startsWith("s")).toList();
        System.out.println(list1);
    }
}
