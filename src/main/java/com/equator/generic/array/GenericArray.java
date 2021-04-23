package com.equator.generic.array;

import java.lang.reflect.Array;

/**
 * @Author: Equator
 * @Date: 2021/4/23 22:19
 **/

public class GenericArray<T> {
    /**
     * 错误用法
     * private T[] array = new T[10];
     */
    private T[] array;

    public GenericArray(Class<T> clz, int len) {
        array = (T[]) Array.newInstance(clz, len);
    }

    public void set(T item, int idx) {
        array[idx] = item;
    }

    public T get(int idx) {
        return array[idx];
    }
}
