package com.example.springbootaop.web;

import com.example.springbootaop.aop.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxianglong
 * @date 2020-11-15
 */
@RestController
public class TestController {

    /**
     * 测试Springboot AOP
     */
    @GetMapping("test")
    @SysLog
    public void test() {
        System.out.println("test");
    }
}
