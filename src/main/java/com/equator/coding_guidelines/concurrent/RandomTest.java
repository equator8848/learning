package com.equator.coding_guidelines.concurrent;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: Equator
 * @Date: 2022/2/7 22:20
 **/

public class RandomTest {
    @Test
    public void test() {
        Random random = new Random();
        random.nextInt();

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        threadLocalRandom.nextInt();
    }
}
