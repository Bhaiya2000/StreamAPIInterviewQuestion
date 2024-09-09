package com.streamAPI.streamapiinterviewquestion.print;

import java.util.stream.Stream;

public class PrintListOfElementUsingStreamAPI {
    public static void main(String[] args) {
        Stream<Object> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(i ->{
            System.out.print(i+" ");
        });
    }
}
