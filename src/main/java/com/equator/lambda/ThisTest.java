package com.equator.lambda;

import java.util.function.Consumer;

/**
 * @Author: Equator
 * @Date: 2020/10/6 0:22
 **/

public class ThisTest {

    private static void func(Object obj, Consumer consumer) {
        consumer.accept(obj);
    }

    private void test() {
        func("leo", (name) -> {
            System.out.println(name);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        new ThisTest().test();
    }
}
