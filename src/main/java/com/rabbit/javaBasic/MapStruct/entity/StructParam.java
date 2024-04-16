package com.rabbit.javaBasic.MapStruct.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author yinhao
 * @date 2024/04/16
 */
@Data
public class StructParam {

    private String id;
    private String paramName;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private Double score;
    private String email;
    private String remark;
    private Date createTime;
    private Date updateTime;

}
