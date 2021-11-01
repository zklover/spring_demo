package com.zklover.service.impl;

import com.zklover.service.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: zhangzhe
 * @date: 2021/11/1 14:35
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Service(version = "1.0.0",group = "DEFAULT_GROUP",interfaceClass = DubboService.class)
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
