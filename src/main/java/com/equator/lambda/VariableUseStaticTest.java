package com.equator.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Equator
 * @Date: 2020/10/3 16:26
 **/
public class VariableUseStaticTest {
    public static int count = 0;

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        fruits.forEach(f -> {
            if ("apple".equals(f)) {
                count++;
            }
        });
        System.out.println("the total number of apple is " + count);
    }
}
