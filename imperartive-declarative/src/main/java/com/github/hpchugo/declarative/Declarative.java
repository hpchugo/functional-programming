package com.github.hpchugo.declarative;

import java.util.stream.IntStream;

public class Declarative {

    public static void main(String[] args) {
        int sumOfEvents = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println(sumOfEvents);
    }
}
