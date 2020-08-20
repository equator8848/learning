package com.equator.learning.service;

import com.equator.learning.dao.MoneyMapper;
import com.equator.learning.model.po.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    public List<Money> getMoneyList() {
        return moneyMapper.all();
    }

    public Money getByName(String name) {
        return moneyMapper.getByName(name);
    }

    @Transactional(rollbackFor = Exception.class)
    public void testTransactionalGood() {
        moneyMapper.transfer("libinkai", 1000);
        int zero = 0;
        int e = 1000 / zero;
    }

    @Transactional
    public void testTransactionalBad() {
        moneyMapper.transfer("libinkai", 1000);
        int zero = 0;
        int e = 1000 / zero;
    }

    @Transactional
    public void testPropagationBad() {
        badTransfer();
    }

    public void badTransfer() {
        moneyMapper.transfer("libinkai", 1000);
        int zero = 0;
        int e = 1000 / zero;
    }
}
