package com.equator.test;

import java.util.Scanner;

/**
 * @Author: Equator
 * @Date: 2021/4/3 17:15
 **/

public class Main1 {
    public static void main(String[] args) {
        /**
         * 给出一百分制成绩，要求输出成绩等级’A’,’B’,’C’,’D’,’E’。90 分以上 为’A’,80~89 分为’B’,70~79 分为’C’,60~69 分为’D’,60 分以下为’E’
         */
        System.out.print("请输入一个成绩: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 90) {
            System.out.println("A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("B");
        } else if (n >= 70 && n <= 79) {
            System.out.println("C");
        } else if (n >= 60 && n <= 69) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
