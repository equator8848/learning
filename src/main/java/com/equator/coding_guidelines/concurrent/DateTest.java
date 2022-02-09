package com.equator.coding_guidelines.concurrent;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: Equator
 * @Date: 2022/2/6 21:44
 **/

public class DateTest {
    @Test
    public void test() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss")));
    }
}
