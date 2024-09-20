package com.streamAPI.streamapiinterviewquestion.calculation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstLetterOfEachWordIntoCapital {
    public static void main(String[] args) {
        String str = "welcome to java";
        String [] arr = str.split(" ");
        String s = Arrays.stream(arr)
                .map(i-> i.substring(0,1).toUpperCase()+i.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(s);
    }
}
