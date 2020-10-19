package com.itheima.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


public class Items implements Serializable {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
