package com.equator.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: Equator
 * @Date: 2020/10/3 16:26
 **/
public class VariableUseIntTest {
    public static void intro(String name, Consumer consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        int age = 22;
        intro("leo", (name) -> {
            System.out.println(String.format("My name is %s. I am %s years old.", name, age));
        });
    }
}
