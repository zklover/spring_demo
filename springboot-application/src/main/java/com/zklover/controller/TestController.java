package com.zklover.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.zklover.annotation.TestAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ServiceLoader;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 14:39
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @NacosValue(value ="${test:default}",autoRefreshed = true)
    private String value;

    @NacosValue(value ="${value1:default}",autoRefreshed = true)
    private String value1;

    @TestAnnotation
    @GetMapping("/test1")
    public String testControllerOne(@RequestParam String name){
        return name;
    }

    @GetMapping("/testInt")
    public int testInt(){
        return 123;
    }

    @GetMapping("/testStr")
    public String testStr(@RequestParam(required = false) String name){
        return value1;
    }
}
