package com.equator.coding_guidelines.format;

/**
 * @Author: Equator
 * @Date: 2021/10/27 23:40
 **/

public class FormatCode {
    public static void main(String[] args) {
        // CTRL + ALT + L快速格式化代码
        int flag = (int) System.currentTimeMillis();

        if (flag > 1) {
            System.out.println("大于1");
        } else if (flag > 2) {
            System.out.println("大于2");
        } else {
            System.out.println("未知");
        }

        System.out.println("end");
    }

    private void test(int a, int b, int c) {
        StringBuffer sb = new StringBuffer();
        sb.append("zi")
                .append("xin")
                .append("huang").append("huang")
                .append("huang");
    }
}
