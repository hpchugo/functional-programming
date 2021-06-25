package com.github.hpchugo.flatmap;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        var flatMap = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMap.get());
    }
}
