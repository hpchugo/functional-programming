package com.github.hpchugo.optional;

import java.util.Optional;

public class Unwrap {
    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);
        var integerVal = optional.get();

        System.out.println(integerVal);

        Optional<Integer> optionalEmpty = Optional.empty();
        integerVal = optionalEmpty.isPresent() ? optionalEmpty.get() : 0;

        System.out.println(integerVal);

        integerVal = optionalEmpty.orElse(0);
        System.out.println(integerVal);

        integerVal = optionalEmpty.orElseGet(() -> 0);
        System.out.println(integerVal);

        integerVal = optional.orElseGet(() -> 0);
        System.out.println(integerVal);

        integerVal = optionalEmpty.orElseThrow(() -> new IllegalArgumentException());
        System.out.println(integerVal);
    }
}
