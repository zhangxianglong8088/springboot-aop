package com.example.springbootaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author: zhangxianglong
 * @date: 2022/2/10
 */
@Slf4j
@Service
public class SysLogService {

    public boolean displayLog(String str) {
        log.info("displayLog方法执行。。。。");
        return true;
    }
}
