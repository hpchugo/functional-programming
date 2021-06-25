package com.github.hpchugo.stream;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        optional.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println);
    }
}
