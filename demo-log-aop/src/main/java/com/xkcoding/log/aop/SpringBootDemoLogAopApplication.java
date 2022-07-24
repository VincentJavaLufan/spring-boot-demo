package com.xkcoding.log.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-01 22:05
 */
@SpringBootApplication
public class SpringBootDemoLogAopApplication {

    static Logger logger = LoggerFactory.getLogger(SpringBootDemoLogAopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoLogAopApplication.class, args);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
