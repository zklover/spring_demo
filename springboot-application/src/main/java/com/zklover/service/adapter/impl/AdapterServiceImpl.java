package com.zklover.service.adapter.impl;

import com.zklover.service.adapter.AdapterAbstarctClass;
import com.zklover.service.adapter.AdapterService;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.stereotype.Service;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 9:16
 * @Description: 适配器模式demo
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Service
public class AdapterServiceImpl extends AdapterAbstarctClass implements AdapterService  {
    @Override
    public void sendEmail() {
        System.out.println("发邮件了---------------------》》》》》》》《《《《《《-------------------------------");
        call();
    }
}
