package com.xkcoding.log.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoLogAopApplicationTests {

    @Test
    public void contextLoads() {
        Logger logger = Logger.getLogger(SpringBootDemoLogAopApplicationTests.class.getName());
        logger.info("\r\naaaaaaaaaaaaaaa\r\n");
        logger.info("\r\naaaaaaaaaaaaaaa\r\n");

    }

}
