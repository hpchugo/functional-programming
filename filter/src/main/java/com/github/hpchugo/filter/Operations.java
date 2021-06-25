package com.github.hpchugo.filter;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("Value");
        var filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());
    }
}
