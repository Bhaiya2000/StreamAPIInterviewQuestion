package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintCountOfEachStringUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","kumar","shukla","anand","shukla");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map);
    }
}
