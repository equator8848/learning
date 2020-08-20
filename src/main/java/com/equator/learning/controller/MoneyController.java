package com.equator.learning.controller;

import com.equator.learning.model.BaseResponse;
import com.equator.learning.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @GetMapping("/getAll/")
    public BaseResponse getAll() {
        return BaseResponse.success(moneyService.getMoneyList());
    }
}
