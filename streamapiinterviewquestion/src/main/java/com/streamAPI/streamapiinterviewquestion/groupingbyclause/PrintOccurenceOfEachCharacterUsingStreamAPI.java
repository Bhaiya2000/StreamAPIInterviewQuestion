package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintOccurenceOfEachCharacterUsingStreamAPI {
    public static void main(String[] args) {
        String s = "anand";
       Map<Character, Long> map =  s.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
