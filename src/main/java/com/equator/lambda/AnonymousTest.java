package com.equator.lambda;

/**
 * @Author: Equator
 * @Date: 2020/10/3 22:28
 **/

public class AnonymousTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, anonymous");
            }
        }).start();
    }
}
