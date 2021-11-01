package com.zklover.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 15:54
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MyException extends Exception{

    private String errorfMsg;

    public MyException(){
        super();
    }

    public MyException(String errorfMsg){
        super(errorfMsg);
        this.errorfMsg = errorfMsg;
    }
}

