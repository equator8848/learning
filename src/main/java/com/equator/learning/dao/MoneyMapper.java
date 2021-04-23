package com.equator.learning.dao;

import com.equator.learning.model.po.Money;
import com.equator.learning.model.po.MoneyBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoneyMapper {
    @Select("SELECT * from t_money")
    List<Money> all();

    @Select("SELECT * from t_money WHERE name = #{userName}")
    Money getByName(@Param("userName") String userName);

    @Update("UPDATE t_money SET money = money + #{money} WHERE name = #{userName}")
    int transfer(@Param("userName") String userName, @Param("money") Integer money);

    @Update("UPDATE t_money SET money = #{money} WHERE name = #{name}")
    int testUpdate(MoneyBean moneyBean);
}
