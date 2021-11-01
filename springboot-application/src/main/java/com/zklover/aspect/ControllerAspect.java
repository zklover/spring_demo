package com.zklover.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 14:51
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Component
@Aspect
public class ControllerAspect {

    @Pointcut("@annotation(com.zklover.annotation.TestAnnotation)")
    public void controllerPoint(){}

    @Pointcut("execution(String com.zklover.controller.*.*(..))")
    public void methodPoint(){}

    @Around("controllerPoint() || methodPoint()")
    public Object aspectAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("切面开始------");
        // 获取入参
        Object[] args = joinPoint.getArgs();
        args[0] = "123";
        Object result = null;
        // 执行方法
        try {
            result = joinPoint.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
            throw  e;
        }
        // 拿到执行结果并处理
        System.out.println("切面结束------");
        return result;
    }
}
