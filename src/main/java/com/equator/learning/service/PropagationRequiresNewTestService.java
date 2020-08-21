package com.equator.learning.service;

import com.equator.learning.dao.MoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PropagationRequiresNewTestService {
    @Autowired
    private MoneyMapper moneyMapper;
    @Autowired
    private PropagationRequiresNewTestService propagationRequiresNewTestService;

    /**
     * 子方法传播级别为REQUIRES_NEW，如果子方法没有异常，那么即使父方法抛出异常，父方法事务会回滚，子方法事务不会回滚
     */
    @Transactional
    public void testPropagationRequiresNewWithoutSubError() {
        moneyMapper.transfer("liuyida", 10000);
        propagationRequiresNewTestService.goodTransfer();
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void goodTransfer() {
        moneyMapper.transfer("libinkai", 1000);
        moneyMapper.transfer("leo", -1000);
    }

    /**
     * 如果子方法抛出异常，子方法事务也会回滚
     */
    @Transactional
    public void testPropagationRequiresNewWithSubError() {
        moneyMapper.transfer("liuyida", 10000);
        propagationRequiresNewTestService.badTransfer();
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void badTransfer() {
        moneyMapper.transfer("libinkai", 1000);
        moneyMapper.transfer("leo", -1000);
        throw new RuntimeException();
    }

    /**
     * goodTransfer(); 这样调用方法，事务是无效的。因为 spring 是使用 aop 来代理事务控制 ，是针对于接口或类的，所以在同一个 service 类中两个方法的调用，传播机制是不生效的
     */
    @Transactional
    public void testPropagationRequiresNewInvalid() {
        moneyMapper.transfer("liuyida", 10000);
        goodTransfer();
        throw new RuntimeException();
    }
}
