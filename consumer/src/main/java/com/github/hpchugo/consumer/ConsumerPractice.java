package com.github.hpchugo.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(541, 78, 5, 87, 1, 4520, 4, 45);
        Consumer<Integer> consumer = System.out :: println;
        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T item : list)
            consumer.accept(item);
    }
}