package com.equator.learning.service;

import com.equator.learning.dao.MoneyMapper;
import com.equator.learning.model.po.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    @Autowired
    private MoneyService moneyService;

    public List<Money> getMoneyList() {
        return moneyMapper.all();
    }

    public Money getByName(String name) {
        return moneyMapper.getByName(name);
    }

    @Transactional(rollbackFor = Exception.class)
    public void testTransactionalGood() {
        moneyMapper.transfer("libinkai", 1000);
        throw new RuntimeException();
    }

    @Transactional
    public void testTransactionalBad() {
        moneyMapper.transfer("libinkai", 1000);
        throw new RuntimeException();
    }

    @Transactional
    public void testPropagationUnknown() {
        moneyMapper.transfer("liuyida", 10000);
        moneyService.badTransfer();
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void badTransfer() {
        moneyMapper.transfer("libinkai", 1000);
        moneyMapper.transfer("leo", -1000);
    }
}
