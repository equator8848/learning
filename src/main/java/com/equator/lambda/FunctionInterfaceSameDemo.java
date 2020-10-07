package com.equator.lambda;

/**
 * @Author: Equator
 * @Date: 2020/10/5 17:52
 **/

public class FunctionInterfaceSameDemo {
    public void welcome(String name, MyFunctionInterface fi) {
        fi.sayHello(name);
    }

    public static void main(String[] args) {
        new FunctionInterfaceSameDemo().welcome("equator", (name) -> System.out.println("welcome, " + name));
        new FunctionInterfaceSameDemo().welcome("equator", (name) -> System.out.println("welcome, " + name));
    }
}
