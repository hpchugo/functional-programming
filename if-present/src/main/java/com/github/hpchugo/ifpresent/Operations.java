package com.github.hpchugo.ifpresent;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        optional.ifPresent(System.out::println);
        optional.ifPresent(val -> System.out.printf("This is a %s", val));
    }
}
