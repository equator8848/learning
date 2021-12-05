package com.equator.coding_guidelines.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer Extend Consumer Super
 *
 * @Author: Equator
 * @Date: 2021/12/4 23:49
 **/

public class PecsDemo {

    class Animal {
        public void walk() {
            System.out.println("walk ...");
        }
    }

    class Dragon extends Animal {
        public void fly() {
            System.out.println("fly ...");
        }
    }

    class MiniDragon extends Dragon {

    }

    class Duck extends Animal {
        public void swim() {
            System.out.println("swim ...");
        }
    }

    @Test
    public void testUpCasting() {
        /**
         *         子类转父类 向上转型
         *         Dragon dragon = new Dragon();
         *         dragon.fly();
         *         Animal animal = dragon;
         *         animal.walk();
         */
        Animal animal = new Dragon();
        animal.walk();
        // ((Dragon) animal).fly();
    }

    public Animal getAnimal() {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);
        return currentTimeMillis % 2 == 0 ? new Dragon() : new Duck();
    }

    @Test
    public void testDownCastingBadCase() {
        Animal animal = getAnimal();
        // 不安全的
        Dragon dragon = (Dragon) animal;
        dragon.fly();
    }

    @Test
    public void testDownCastingGoodCase() {
        Animal animal = getAnimal();
        if (animal instanceof Dragon) {
            Dragon dragon = (Dragon) animal;
            dragon.fly();
        }
    }

    @Test
    public void testSuper() {
        // super 设置泛型下限
        // <? super T> 表示类型下界（Java Core中叫超类型限定），表示参数化类型是此类型的超类型（父类型），直至Object
        List<Animal> animals = new ArrayList<>();
        List<? super Dragon> dragons = animals;
        dragons.add(new Dragon());
        dragons.add(new MiniDragon());
        Object object = dragons.get(0);
        // dragons.add(new Animal());
    }

    @Test
    public void testExtend() {
        // extends 设置泛型上限
        // <? extends T> 表示类型的上界，表示参数化类型的可能是T 或是 T的子类
        List<? extends Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Duck());
        // animals.add(new Dragon());
        Animal animal = animals.get(0);
    }

    @Test
    public void testExtend2() {
        // extends 设置泛型上限
        List<Dragon> dragons = new ArrayList<>();
        List<? extends Animal> animals = dragons;
        // animals.add(new Duck());
        // animals.add(new Animal());
        Animal animal = animals.get(0);
    }
}
