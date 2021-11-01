package com.zklover.controller;

import com.zklover.service.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangzhe
 * @date: 2021/11/1 14:50
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@RequestMapping("/test")
@RestController
public class TestDubboController {

    @Reference(version = "1.0.0",group = "DEFAULT_GROUP",interfaceClass = DubboService.class)
    private DubboService dubboService;

    @GetMapping("/testDubbo")
    public String testDubbo(@RequestParam String name){
        return this.dubboService.sayHello(name);
    }
}
