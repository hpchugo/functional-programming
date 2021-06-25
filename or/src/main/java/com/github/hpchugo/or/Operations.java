package com.github.hpchugo.or;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        optional.or(() -> Optional.of("NewValue")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("NewValue")).ifPresent(System.out::println);

    }
}
