package com.equator.lambda;

/**
 * @Author: Equator
 * @Date: 2020/10/5 17:52
 **/

public class FunctionInterfaceDemo {
    public void welcome(String name, MyFunctionInterface fi) {
        fi.sayHello(name);
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            new FunctionInterfaceDemo().welcome("equator", (name) -> System.out.println("welcome, " + name));
        } else {
            new FunctionInterfaceDemo().welcome("leo", (name) -> System.out.println("hi, " + name));
        }
    }
}

