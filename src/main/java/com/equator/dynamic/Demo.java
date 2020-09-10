package com.equator.dynamic;

import com.equator.dynamic.base.Consumer;
import com.equator.dynamic.base.Producer;
import com.equator.dynamic.ordinary.TransformationA;

public class Demo {
    public static void main(String[] args) {
        new Thread(new Producer("Topic1")).start();
        new Thread(new Producer("Topic2")).start();
        new Thread(new Producer("Topic3")).start();
        new Thread(new Consumer("Topic4")).start();
        new Thread(new Consumer("Topic5")).start();
        new Thread(new TransformationA()).start();
    }
}
