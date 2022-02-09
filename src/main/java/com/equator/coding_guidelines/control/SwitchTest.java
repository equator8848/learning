package com.equator.coding_guidelines.control;

import org.junit.Test;

/**
 * @Author: Equator
 * @Date: 2022/2/9 8:21
 **/

public class SwitchTest {
    @Test
    public void test() {
        String flag = "apple";
        switch (flag) {
            case "apple":
                System.out.println("apple");
                break;
            case "orange":
                System.out.println("orange");
                return;
            case "test1":
            case "test2":
                System.out.println("test");
                return;
            default:
                System.out.println("default");
        }
    }
}
