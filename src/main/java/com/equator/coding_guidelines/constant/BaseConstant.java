package com.equator.coding_guidelines.constant;

/**
 * @Author: Equator
 * @Date: 2021/10/24 20:52
 **/

public class BaseConstant {
    private static final class Bool {
        private static final int TRUE = 1;
        private static final int FALSE = 0;
    }

    private enum BoolEnum {
        // XXX
        TRUE,
        FALSE;
    }

    private void run() {
        String a = "hello";
        System.out.println(a);
    }

    private static final int A_FLAG = 100;

    private void test(int a) {
        if (a == A_FLAG) {
            System.out.println(true);
        }
        // l1
        Long b = 2L;
        System.out.println(b);
    }

    public static void main(String[] args) {
        new BaseConstant().test(2);
    }
}
