package com.equator.parameter;

import com.equator.lambda.Box;

/**
 * @Author: Equator
 * @Date: 2020/10/6 11:11
 **/

public class ObjChangeTest {
    public void method(Box age) {
        age = new Box(18);
        System.out.println("inside " + age);
    }

    public static void main(String[] args) {
        Box age = new Box(22);
        System.out.println("before " + age);
        new ObjChangeTest().method(age);
        System.out.println("after " + age);
    }
}
