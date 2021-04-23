package com.equator.test;

import java.util.Scanner;

/**
 * @Author: Equator
 * @Date: 2021/4/3 17:15
 **/

public class Main4 {
    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please input the value of n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        int i = 1;
        do {
            sum += factorial(i);
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
}
