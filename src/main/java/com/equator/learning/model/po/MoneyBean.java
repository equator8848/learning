package com.equator.learning.model.po;

import lombok.Data;

@Data
public class MoneyBean {
    private Integer id;

    private String name;

    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}