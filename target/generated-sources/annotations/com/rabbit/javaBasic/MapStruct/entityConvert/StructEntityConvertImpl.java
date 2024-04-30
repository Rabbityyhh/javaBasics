package com.rabbit.javaBasic.MapStruct.entityConvert;

import com.rabbit.javaBasic.MapStruct.entity.StructDto;
import com.rabbit.javaBasic.MapStruct.entity.StructParam;
import java.text.DecimalFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-28T13:48:11+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class StructEntityConvertImpl implements StructEntityConvert {

    @Override
    public StructDto toDto(StructParam structParam) {
        if ( structParam == null ) {
            return null;
        }

        StructDto structDto = new StructDto();

        structDto.setName( structParam.getParamName() );
        if ( structParam.getAddress() != null ) {
            structDto.setAddress( structParam.getAddress() );
        }
        else {
            structDto.setAddress( "dto地址" );
        }
        if ( structParam.getScore() != null ) {
            structDto.setScore( new DecimalFormat( "#.00" ).format( structParam.getScore() ) );
        }
        structDto.setEmail( structParam.getEmail() );
        structDto.setRemark( structParam.getRemark() );

        structDto.setSex( structParam.getSex().equals("男") ? "M" : "F" );
        structDto.setAge( valueAddOne(structParam.getAge()) );
        structDto.setPhone( "123123" );

        return structDto;
    }

    @Override
    public StructParam toParam(StructDto structDto) {
        if ( structDto == null ) {
            return null;
        }

        StructParam structParam = new StructParam();

        structParam.setId( structDto.getId() );
        structParam.setAge( valueAddOne( structDto.getAge() ) );
        structParam.setSex( structDto.getSex() );
        structParam.setAddress( structDto.getAddress() );
        structParam.setPhone( structDto.getPhone() );
        if ( structDto.getScore() != null ) {
            structParam.setScore( Double.parseDouble( structDto.getScore() ) );
        }
        structParam.setEmail( structDto.getEmail() );
        structParam.setRemark( structDto.getRemark() );

        return structParam;
    }
}
