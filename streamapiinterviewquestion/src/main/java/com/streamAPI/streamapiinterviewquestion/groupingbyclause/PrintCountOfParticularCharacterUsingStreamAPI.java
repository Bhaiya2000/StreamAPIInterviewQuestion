package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

public class PrintCountOfParticularCharacterUsingStreamAPI {
    public static void main(String[] args) {
        String s = "anand";
        int count  = (int) s.chars().filter(i-> (char) i == 'a').count();
        System.out.println(count);
    }
}
