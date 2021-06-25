package com.github.hpchugo.functionaliterface;

public class LambdaExample {

    public static void main(String[] args) {
        MyFunctionalInterface fun = () -> System.out.println("Thread Executed!");
        fun.myMethod();
    }
}
