package com.springboot.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zg on 2016/9/13.
 */
@SpringBootApplication
public class AppServer {
    private final static Logger logger = LoggerFactory.getLogger(AppServer.class);

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
        logger.info("start over...");
    }
}
