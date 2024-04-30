package com.rabbit.javaBasic.MapStruct.service;

import com.rabbit.javaBasic.MapStruct.entity.StructDto;
import com.rabbit.javaBasic.MapStruct.entity.StructParam;
import com.rabbit.javaBasic.MapStruct.entityConvert.StructEntityConvert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author yinhao
 * @date 2024/04/16
 */
@Service
@RequiredArgsConstructor
public class TestMapStructService {

    private final StructEntityConvert structEntityConvert;

    /**
     * @return {@link StructDto}
     * 实体相互转换
     */
    public StructDto toDto() {
        StructParam structParam = new StructParam();
        structParam.setId("1");
        structParam.setParamName("param");
        structParam.setAge(10);
        structParam.setSex("男");
        structParam.setScore(10.5);
        structParam.setAddress("param地址");
        structParam.setPhone("112312312");

//        StructDto dto = structEntityConvert.toDto(structParam);
//        System.out.println(dto);
        return new StructDto();
    }

}
