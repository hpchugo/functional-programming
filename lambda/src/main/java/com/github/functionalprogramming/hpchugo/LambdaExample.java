package com.github.functionalprogramming.hpchugo;

public class LambdaExample {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread Executed!"));
        t.start();
    }
}
