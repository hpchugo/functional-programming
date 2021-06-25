package com.github.hpchugo.ifpresentorelse;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
    }
}
