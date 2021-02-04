package com.kihyeonkim.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * IDE : IntelliJ IDEA
 * Created by kiheyunkim@gmail.com on 2021-02-04
 * Github : http://github.com/kiheyunkim
 * Comment : Swagger API를 사용하기 위한 Configuration 설정
 */
@Configuration
@EnableSwagger2                                             //Swagger2를 활성화하기 위한 Annotation
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("V1")
                .select()                                   //Builder를 통해서 Swagger에 대한 설정을 진행
                .apis(RequestHandlerSelectors.basePackage("com.kihyeonkim.controller"))        //어떤 package 내의 Controller들을 이용할지 지정, any는 전체
                .paths(PathSelectors.any())                 //특정 uri를 지정(ant Matcher나 regex)하여 이요할지 지정, any는 동일
                .build();
    }

    @Bean
    public Docket api2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("V2")
                .select()                                   //Builder를 통해서 Swagger에 대한 설정을 진행
                .apis(RequestHandlerSelectors.basePackage("com.kihyeonkim.controller2"))        //어떤 package 내의 Controller들을 이용할지 지정, any는 전체
                .paths(PathSelectors.any())                 //특정 uri를 지정(ant Matcher나 regex)하여 이요할지 지정, any는 동일
                .build();
    }
}
