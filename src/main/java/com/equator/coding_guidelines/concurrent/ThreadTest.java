package com.equator.coding_guidelines.concurrent;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: Equator
 * @Date: 2021/12/19 23:26
 **/

public class ThreadTest {
    @Test
    public void testCreateThread() {
        new Thread(() -> System.out.println("hi")).run();
    }

    @Test
    public void randomTest() {
        Random random = new Random();
        random.nextInt();

        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.nextInt();
    }
}
