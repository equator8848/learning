package com.equator.parameter;

/**
 * @Author: Equator
 * @Date: 2020/10/6 11:11
 **/

public class StringTest {
    public void method(String name) {
        name = "刘德华";
        System.out.println("inside " + name);
    }

    public static void main(String[] args) {
        String name = "leo";
        System.out.println("before " + name);
        new StringTest().method(name);
        System.out.println("after " + name);
    }
}
