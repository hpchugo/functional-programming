package com.github.hpchugo.optional;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String val = "A string";
        Optional<String> optional = Optional.of(val);
        Optional<Integer> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);

        System.out.println(optional);
        System.out.println(empty);
        System.out.println(nullable);
        System.out.println(emptyOptional);
    }
}
