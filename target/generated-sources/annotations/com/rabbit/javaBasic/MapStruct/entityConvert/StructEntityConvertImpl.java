package com.rabbit.javaBasic.MapStruct.entityConvert;

import com.rabbit.javaBasic.MapStruct.entity.StructDto;
import com.rabbit.javaBasic.MapStruct.entity.StructParam;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-30T10:35:12+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class StructEntityConvertImpl implements StructEntityConvert {

    @Override
    public StructParam toParam(StructDto structDto) {
        if ( structDto == null ) {
            return null;
        }

        StructParam structParam = new StructParam();

        return structParam;
    }
}
