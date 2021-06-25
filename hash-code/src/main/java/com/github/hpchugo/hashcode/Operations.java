package com.github.hpchugo.hashcode;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());
    }
}
