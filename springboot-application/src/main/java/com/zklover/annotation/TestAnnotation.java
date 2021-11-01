package com.zklover.annotation;

import java.lang.annotation.*;

/**
 * @author: zhangzhe
 * @date: 2021/10/28 14:43
 * @Description: TODO
 * @contact zhangzhe03@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface TestAnnotation {

    String value() default "";
}
