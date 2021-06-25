package com.github.hpchugo.functionaliterface;

public class LambdaExample2 {

    public static void main(String[] args) {
        onTheFly(()-> System.out.println("Hello"));
    }

    public static void onTheFly(MyFunctionalInterface fun){
        fun.myMethod();
    }
}
