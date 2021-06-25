package com.github.hpchugo.unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);
        UnaryOperator<Integer> operator = i -> i * 1000;
        List<Integer> returnList = mapper(list, operator);
        System.out.println(returnList);
    }

    private static<T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        var newList = new ArrayList<T>();
        for (T item : list)
            newList.add(operator.apply(item));
        return newList;

    }


}
