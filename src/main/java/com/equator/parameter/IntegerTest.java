package com.equator.parameter;

/**
 * @Author: Equator
 * @Date: 2020/10/6 11:11
 **/

public class IntegerTest {
    public void method(Integer age) {
        age = 18;
        System.out.println("inside " + age);
    }

    public static void main(String[] args) {
        Integer age = 22;
        System.out.println("before " + age);
        new IntegerTest().method(age);
        System.out.println("after " + age);
    }
}
