package com.equator.coding_guidelines.collection;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Equator
 * @Date: 2021/12/4 23:38
 **/

public class SubList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("leo");
        stringList.add("equator");
        stringList.add("haha");
        stringList.add("summer");
        List<String> subList = stringList.subList(1, 2);
        System.out.println(subList);

        // stringList.remove("equator");
        // System.out.println(subList);
        System.out.println(stringList);

        subList.add("ya");
        System.out.println(stringList);
    }
}
