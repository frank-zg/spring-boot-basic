package com.springboot.basic.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zg on 2016/8/22.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("springbootServer")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .securitySchemes(Lists.newArrayList(new ApiKey("frank", "admin", "admin")))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.basic.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(swaggerApiInfo());
    }

    private ApiInfo swaggerApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Platform API",//大标题
                "spring boot basic",//小标题
                "0.1",//版本
                "NO terms of service",
                new Contact("frank_zhao", "", "125826029@qq.com"),
                "spring boot,   Version 1.0",//链接显示文字
                "http://apache.org/"//网站链接
        );
        return apiInfo;
    }
}
