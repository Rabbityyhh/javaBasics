package com.rabbit.javaBasic.mybatisplus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi
@Configuration
public class swaggerConfig implements WebMvcConfigurer {

    @Bean
    public Docket createRestApi() {
        //返回文档摘要信息
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //配合@EnableOpenApi 找到API位置，不需要再在启动类上配置
                .apis(RequestHandlerSelectors.basePackage("com.rabbit.javaBasic.hutool.core.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    //生成接口信息，包括标题、联系人等
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger3接口文档")
                .description("Rabbit用Swagger3.0。")
                .contact(new Contact("Rabbit", "https://swagger.io/", "362250024@qq.com"))
                .version("1.0")
                .build();
    }

}