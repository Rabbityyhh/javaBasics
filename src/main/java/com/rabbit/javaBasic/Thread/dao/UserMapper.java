package com.rabbit.javaBasic.Thread.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbit.javaBasic.Thread.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HUAWEI
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-28 16:42:36
* @Entity .com.rabbit.javaBasic.Thread.dto.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




