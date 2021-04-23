package com.equator.test;

import java.util.Scanner;

/**
 * @Author: Equator
 * @Date: 2021/4/3 17:15
 **/

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums; i++) {
            int n = in.nextInt();
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println(max + " " + min);
    }
}
