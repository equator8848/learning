package com.equator.coding_guidelines.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Equator
 * @Date: 2021/12/5 10:24
 **/

public class ListToArray {
    @Test
    public void test() {
        List<String> stringList = new ArrayList<>();
        stringList.add("leo");
        stringList.add("equator");

        Object[] objects = stringList.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        System.out.println("--------------------");

        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);
        for (String s : stringArray) {
            System.out.println(s);
        }

    }

    @Test
    public void testList2Array() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("haha");

        String[] str = new String[]{"you", "wu"};
        List list = Arrays.asList(str);
        list.add("ya");
    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("3");
        for (String item : list) {
            if ("0".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
