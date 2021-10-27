package com.equator.coding_guidelines.oop;

/**
 * @Author: Equator
 * @Date: 2021/10/26 23:49
 **/

public class StaticRef {
    public int age = 0;
    public static int field = 0;

    public static void func() {
        System.out.println("func");
    }

    public void test() {
        System.out.println("test");
    }

    public void test1() {
        System.out.println("test");
    }

    /**
     * javap -c -v target/classes/com/equator/coding_guidelines/oop/StaticRef.class
     *
     * @param args
     */
    public static void main(String[] args) {
        StaticRef staticRef = new StaticRef();
        StaticRef staticRef2 = new StaticRef();
        // 不推荐
        System.out.println(staticRef.field);
        staticRef.func();
        // 推荐
        System.out.println(StaticRef.field);
        StaticRef.func();

        System.out.println(staticRef.age);

        staticRef.test();
        staticRef2.test1();
    }
}
