package com.equator.test;

import java.util.Scanner;

/**
 * @Author: Equator
 * @Date: 2021/4/3 17:15
 **/

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Please input the value of n:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase();
        char[] chars = input.toCharArray();
        int[] counter = new int[26];
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch < 'A' || ch > 'Z') {
                continue;
            }
            counter[ch - 'A']++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println("(" + (char) (65 + i) + ")Num=" + counter[i]);
            }
        }
    }
}
