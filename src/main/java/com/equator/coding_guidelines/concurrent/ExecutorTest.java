package com.equator.coding_guidelines.concurrent;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.Timer;
import java.util.concurrent.*;

/**
 * @Author: Equator
 * @Date: 2021/12/19 23:14
 **/

public class ExecutorTest {
    @Test
    public void badCase() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(4);
    }

    @Test
    public void goodCase() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("equator-thread-%d").build();
        new ThreadPoolExecutor(5, 200, 0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(512), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    }
}
