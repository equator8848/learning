package com.equator.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Equator
 * @Date: 2020/10/3 16:26
 **/
public class VariableUseStringTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        String tag = "apple";
        fruits.forEach(f -> {
            if (tag.equals(f)) {
                System.out.println("apple !");
            }
        });
    }
}
