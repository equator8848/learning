package com.equator.learning.transactional;

import com.equator.learning.BaseTest;
import com.equator.learning.service.MoneyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MoneyTest extends BaseTest {
    @Autowired
    private MoneyService moneyService;

    @Test
    public void testTransactionalGood() {
        System.out.println(moneyService.getByName("libinkai"));
        moneyService.testTransactionalGood();
        System.out.println(moneyService.getByName("libinkai"));
    }

    @Test
    public void testTransactionalBad() {
        System.out.println(moneyService.getByName("libinkai"));
        moneyService.testTransactionalBad();
        System.out.println(moneyService.getByName("libinkai"));
    }

    @Test
    public void testPropagationUnknown() {
        System.out.println(moneyService.getByName("libinkai"));
        moneyService.testPropagationUnknown();
        System.out.println(moneyService.getByName("libinkai"));
    }
}
