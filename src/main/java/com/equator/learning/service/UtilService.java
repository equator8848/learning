package com.equator.learning.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: Equator
 * @Date: 2020/11/10 0:14
 **/

@Service
public class UtilService {
    public void test() throws IOException {
        Properties properties = new Properties();
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("com/equator/learning/controller/test.properties");
        byte[] arr = new byte[1024];
        System.out.println(systemResourceAsStream);
        systemResourceAsStream.read(arr,0,1024);
        System.out.println(new String(arr));
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("com/equator/learning/controller/test.properties");
        System.out.println(resourceAsStream);
        resourceAsStream.read(arr,0,1024);
        System.out.println(new String(arr));
    }
}
