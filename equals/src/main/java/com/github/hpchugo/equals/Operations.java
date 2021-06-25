package com.github.hpchugo.equals;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        System.out.println(optional.equals(Optional.of("Value")));
        Optional.empty().stream().forEach(System.out::println);
    }
}
