package com.streamAPI.streamapiinterviewquestion.interviewrivision;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromListOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","anand","satna","shukla","brisinghpur");
        List<String> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}
