package com.github.hpchugo.map;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        var map = optional.map(val -> "Replaced").orElse("Empty");
        System.out.println(map);
    }
}
