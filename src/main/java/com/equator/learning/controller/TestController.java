package com.equator.learning.controller;

import com.equator.learning.model.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/echo/")
    public BaseResponse echo(String msg) {
        return BaseResponse.success(msg);
    }
}
