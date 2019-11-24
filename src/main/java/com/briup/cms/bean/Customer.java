package com.briup.cms.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/*
   将这个类实例化   实体  自动建表
 */
@Entity
@ApiModel
public class Customer implements Serializable {

    // 主键约束
    @Id
    // 使主键自动增长
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "客户id")
    private int id;

    @ApiModelProperty(value = "客户名字")
    private String name;

    @ApiModelProperty(value = "客户钱" ,required = true)
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
