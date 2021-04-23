package com.equator.learning.controller;

import com.equator.learning.model.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/echo/")
    public BaseResponse echo(String msg) {
        return BaseResponse.success(msg);
    }

    @GetMapping("/get/")
    public BaseResponse get() throws IOException {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("com/equator/learning/controller/test.properties");
        byte[] arr = new byte[1024];
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(TestController.class.getClassLoader());
        System.out.println(systemResourceAsStream);
        systemResourceAsStream.read(arr,0,1024);
        System.out.println(new String(arr));
        InputStream resourceAsStream = TestController.class.getClassLoader().getResourceAsStream("com/equator/learning/controller/test.properties");
        System.out.println(resourceAsStream);
        resourceAsStream.read(arr,0,1024);
        System.out.println(new String(arr));
        return BaseResponse.success();
    }
}
