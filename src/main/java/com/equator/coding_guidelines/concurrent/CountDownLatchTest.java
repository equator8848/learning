package com.equator.coding_guidelines.concurrent;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: Equator
 * @Date: 2022/2/7 22:13
 **/

public class CountDownLatchTest {
    @Test
    public void test1() {
        ThreadPoolService.submit(() -> {
            System.out.println("thread");
        });
        System.out.println("test1");
    }

    @Test
    public void test2() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ThreadPoolService.submit(() -> {
            System.out.println("thread1");
            countDownLatch.countDown();
        });
        ThreadPoolService.submit(() -> {
            System.out.println("thread2");
            // error
            countDownLatch.countDown();
        });
        countDownLatch.await();
        System.out.println("test2");
    }
}
