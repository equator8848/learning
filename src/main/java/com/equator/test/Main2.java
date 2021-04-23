package com.equator.test;

import java.util.Scanner;

/**
 * @Author: Equator
 * @Date: 2021/4/3 17:15
 **/

public class Main2 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("programe is over.");
                break;
            }
            if (isPrime(n)) {
                System.out.println(n + " is sushu.");
            } else {
                System.out.println(n + " is not sushu.");
            }
        }
    }
}
