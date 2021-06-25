package com.github.hpchugo.imperative;

public class Imperative {

    public static void main(String[] args) {
        int sumOfEvens = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0)
                sumOfEvens = sumOfEvens + i;
        }
        System.out.println(sumOfEvens);
    }
}
