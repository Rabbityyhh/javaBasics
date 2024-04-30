package com.rabbit.javaBasic.MapStruct.entityConvert;

import com.rabbit.javaBasic.MapStruct.entity.StructDto;
import com.rabbit.javaBasic.MapStruct.entity.StructParam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author yinhao
 * @date 2024/04/16
 * <p>
 * 访问接口中的方法有两种方式，分别是  StructDtoConvert INSTANCE = Mappers.getMapper(StructDtoConvert.class);
 *                              或者是使用注解 @Mapper(componentModel = "spring")
 *                              两种方式都可以访问接口中的方法，但是使用注解的方式更加方便
 * 注解 @Mapping 属性说明：
 *              1. target：目标属性
 *              2. source：源属性
 *              3. expression：表达式映射
 *
 *              除了下方提供的一些常用例子之外，  还可以使用嵌套转接 多个数据源 切面等等等
 *
 */
@Mapper(componentModel = "spring")
public interface StructEntityConvert {

//    StructDtoConvert INSTANCE = Mappers.getMapper(StructDtoConvert.class);


//    @Mapping(target = "name", source = "paramName")  // 进行属性映射： target 目标属性  source 源属性
//    @Mapping(target = "id", ignore = true)  // 忽略属性映射： target 目标属性  ignore = true 忽略该属性
//    @Mapping(target = "sex", expression = "java(structParam.getSex().equals(\"男\") ? \"M\" : \"F\")") // 表达式映射： target 目标属性  expression = "java(源属性.equals(\"男\") ? \"M\" : \"F
//    @Mapping(target = "age", expression = "java(valueAddOne(structParam.getAge()))") // 可以自定义方法
//    @Mapping(target = "address", defaultValue = "dto地址") // 当structParam中的 address 仅为null时，使用默认值
//    @Mapping(target = "phone", constant = "123123") // 固定值映射： target 目标属性  constant = "123123" 会覆盖源中的值
//    @Mapping(target = "score", source = "score", numberFormat = "#.00") // 数字格式化： target 目标属性  source = "score"  numberFormat = "#. 00"  还有dataFormat等
//    StructDto toDto(StructParam structParam);

    StructParam toParam(StructDto structDto);

    default int valueAddOne(Integer value) {
        return value + 1;
    }

}
