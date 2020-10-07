package com.equator.lambda;

/**
 * @Author: Equator
 * @Date: 2020/10/3 22:27
 **/

public class LambdaOneThreadTest {
    private static void hi(String name, MyFunctionInterface fi) {
        fi.sayHello(name);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        hi("leo", (name) -> {
            System.out.println("inner, " + Thread.currentThread());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi, " + name);
        });
        System.out.println(Thread.currentThread());
    }
}
