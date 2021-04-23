package com.equator.generic.array;

import java.util.ArrayList;

/**
 * @Author: Equator
 * @Date: 2021/4/23 22:18
 **/

public class CreateArrayTest {
    public static void main(String[] args) {
        ArrayList<String>[] listArr = new ArrayList[3];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");

        listArr[0] = strList;
        System.out.println(listArr.getClass());
        String s = listArr[0].get(0);
        System.out.println(s);
    }
}
