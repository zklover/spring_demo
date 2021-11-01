package com.zklover.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author: zhangzhe
 * @date: 2021/10/29 9:28
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Data
@Builder
public class ResultBuilder {

    private int code;

    private String message;

    private Object data;

    public static ResultBuilder buildSuccess(){
        return ResultBuilder.builder().code(200).build();
    }

    public static ResultBuilder buildFailure(String msg){
        return ResultBuilder.builder().code(500).message(msg).build();
    }
}
