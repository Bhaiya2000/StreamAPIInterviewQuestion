package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.List;

public class FindStringWithLengthThreeAndStartsWithAUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("ana", "shukl","ama","shu","pra","ask");
        List<String> list1 = list.stream().filter(i->i.startsWith("a") && i.length() == 3).toList();
        System.out.println(list1);
    }
}
