package com.equator.coding_guidelines.control;

import org.junit.Test;

/**
 * @Author: Equator
 * @Date: 2022/2/8 23:49
 **/

public class GuardTest {
    public void today() {
        if (!isBusy()) {
            if (!isFree()) {
                System.out.println("stay at home to learn Alibaba Java Coding Guidelines.");
            } else {
                System.out.println("go to travel.");
            }
        } else {
            System.out.println("change time.");
        }
    }

    public void todayGuard() {
        // https://www.jianshu.com/p/738bf2e998b0
        if (isBusy()) {
            System.out.println("change time.");
            return;
        }

        if (isFree()) {
            System.out.println("go to travel.");
            return;
        }

        System.out.println("stay at home to learn Alibaba Java Coding Guidelines.");
    }

    private boolean isBusy() {
        return false;
    }

    private boolean isFree() {
        return false;
    }

    @Test
    public void demo() {
        today();

        todayGuard();
    }
}
