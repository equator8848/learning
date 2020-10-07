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
@Slf4j
public class VariableTest {

    @Test
    public void test0() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        int count = (int) fruits.stream().filter("apple"::equals).count();
        System.out.println("the total number of apple is " + count);
    }

    @Test
    public void test1() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        String tag = "apple";
        fruits.forEach(f -> {
            if (tag.equals(f)) {
                System.out.println("apple !");
            }
        });
    }

    @Test
    public void test2() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        int count = 0;
        fruits.forEach(f -> {
            if ("apple".equals(f)) {
                // num++;
                System.out.println(count);
            }
        });
        System.out.println("the total number of apple is " + count);
    }

    @Test
    public void test3() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        AtomicInteger count = new AtomicInteger();
        fruits.forEach(f -> {
            if ("apple".equals(f)) {
                count.getAndIncrement();
            }
        });
        System.out.println("the total number of apple is " + count.get());
    }

    @Test
    public void test4() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        final int[] count = {0};
        fruits.forEach(f -> {
            if ("apple".equals(f)) {
                count[0]++;
            }
        });
        System.out.println("the total number of apple is " + count[0]);
    }

    @Test
    public void test5() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "watermelon", "grape");
        Box box = new Box(0);
        fruits.forEach(f -> {
            if ("apple".equals(f)) {
                box.setNum(box.getNum() + 1);
            }
        });
        System.out.println("the total number of apple is " + box.getNum());
    }
}
