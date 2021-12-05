package com.equator.coding_guidelines.oop;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Equator
 * @Date: 2021/11/16 23:39
 **/
@Data
public class Student {
    private Integer id;

    private String name;

    private Date createTime = new Date();

    private boolean xxx;

    private boolean isXxx(){
        return xxx;
    }

    private boolean g(){
        return xxx;
    }

    public static void main(String[] args) {
         Student student = new Student();
        student.setId(1);
        student.setName("leo");
        student = new Student();
        // update
        BigDecimal val = new BigDecimal("0.01");
        BigDecimal.valueOf(0.01);
    }
}
