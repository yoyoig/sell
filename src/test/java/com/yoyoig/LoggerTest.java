package com.yoyoig;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * Created by 铭刻 on 2018/1/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    /**
     * 可以使用
     * @Slf4j
     * 来代替以下代码
     */
//    private final Logger log = org.slf4j.LoggerFactory.getLogger(LoggerTest.class);

    /**
     * 日志级别:
     *  error  40
     *  warn   30
     *  info   20
     *  debug  10
     *  trace  0
     *
     */


    @Test
    public void test1(){

        /**
         * 系统默认日志级别为info
         * 所以以下打印不输出info以下级别
         * 只输出info和error
         *
         */
        //报红,可能是由于idea底版本导致
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
        log.info("test");

        /**
         * 通过字符串中的{}来添加变量
         *{} -> 占位符
         */

        String name = "yoyoig";
        String password = "123456";

        log.info("name: {},password: {}",name,password);

    }


}