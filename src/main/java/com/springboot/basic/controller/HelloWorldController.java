package com.springboot.basic.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zg on 2016/12/15.
 */
@RestController
@Api(value = "hello world")
public class HelloWorldController {


    @RequestMapping(value = "/helloworld", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ApiOperation(value = "hello world method")
    public String helloWorld() {
        return "hello world";
    }
}
