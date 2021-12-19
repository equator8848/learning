package com.equator.coding_guidelines.concurrent;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Equator
 * @Date: 2021/12/19 23:42
 **/

public class TimerTest {
    @Test
    public void timerTest() throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("haha");
            }
        }, 10);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("error");
                throw new RuntimeException();
            }
        }, 10);
        Thread.sleep(100);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("god");
            }
        }, 10);


        Thread.sleep(10000);
    }

    @Test
    public void testSchedule() throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(() -> {
            System.out.println("haha");
        }, 1, TimeUnit.SECONDS);
        Thread.sleep(2000);

        scheduledExecutorService.schedule(() -> {
            System.out.println("error");
            throw new RuntimeException();
        }, 1, TimeUnit.SECONDS);

        Thread.sleep(2000);
        scheduledExecutorService.schedule(() -> {
            System.out.println("god");
        }, 1, TimeUnit.SECONDS);

        Thread.sleep(2000);
    }
}
