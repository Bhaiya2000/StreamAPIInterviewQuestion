package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringToUpperCase {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("anand","shukla","satna");
        List<String> convertedList = list.stream().map(String :: toUpperCase).toList();
        System.out.println(convertedList);
    }
}
