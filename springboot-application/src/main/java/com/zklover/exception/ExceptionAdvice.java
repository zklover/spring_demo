package com.zklover.exception;

import com.zklover.entity.ResultBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 15:53
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResultBuilder exceptionHandler(Exception e){
        return ResultBuilder.buildFailure(e.getMessage());
    }
}
