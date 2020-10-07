package com.equator.lambda;

/**
 * @Author: Equator
 * @Date: 2020/10/3 22:27
 **/

public class LambdaThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        new Thread(() -> {
            System.out.println("hello, lambda");
            System.out.println("inner" + Thread.currentThread());
        }).start();
        System.out.println(Thread.currentThread());
    }
}
