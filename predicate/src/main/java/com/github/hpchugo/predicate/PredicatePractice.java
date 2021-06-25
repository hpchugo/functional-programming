package com.github.hpchugo.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Basics", "", "Strong", "", "BasicsStrong");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> filteredList = filterList(list, filter);

        List<Integer> intList = Arrays.asList(1,4, 6, 7, 8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        List<Integer> filteredIntList = filterList(intList, integerFilter);

        System.out.println(newList);
        System.out.println(filteredList);
        System.out.println(filteredIntList);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for(T item : list){
            if(predicate.test(item))
                newList.add(item);
        }
        return newList;
    }

}
