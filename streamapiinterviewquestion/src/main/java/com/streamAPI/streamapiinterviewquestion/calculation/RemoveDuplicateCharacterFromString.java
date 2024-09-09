package com.streamAPI.streamapiinterviewquestion.calculation;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        String s = "anandshukla";
        StringBuilder builder = new StringBuilder();
        s.chars().distinct().forEach(a -> {
            builder.append((char)a);
        });
        System.out.println(builder.toString());
    }
}
