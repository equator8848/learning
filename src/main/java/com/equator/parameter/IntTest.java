package com.equator.parameter;

/**
 * @Author: Equator
 * @Date: 2020/10/6 11:11
 **/

public class IntTest {
    public void method(int age) {
        age = 18;
        System.out.println("inside " + age);
    }

    public static void main(String[] args) {
        int age = 22;
        System.out.println("before " + age);
        new IntTest().method(age);
        System.out.println("after " + age);
    }
}
