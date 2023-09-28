package com.rabbit.javaBasic.Thread.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @author yinhao
 * @TableName user
 * @date 2023/09/28
 */
@TableName(value ="user")
@Data
public class User implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String userName;

    private Integer age;

    private Integer identity;

    private static final long serialVersionUID = 1L;
}