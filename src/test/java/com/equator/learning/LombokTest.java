package com.equator.learning;

import com.equator.learning.dao.MoneyMapper;
import com.equator.learning.model.po.MoneyBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Equator
 * @Date: 2020/10/31 10:53
 **/

public class LombokTest extends BaseTest{
    @Autowired
    private MoneyMapper moneyMapper;

    @Test
    public void test(){
        MoneyBean moneyBean = new MoneyBean();
        moneyBean.setMoney(999);
        moneyBean.setName("leo");
        moneyMapper.testUpdate(moneyBean);
    }
}
