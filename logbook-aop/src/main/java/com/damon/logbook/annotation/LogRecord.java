package com.damon.logbook.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 操作日志的核心注解
 * @author damon
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LogRecord {

    /**
     *
     * @return 业务ID
     */
    String bizNo();

    /**
     *
     * @return 操作人
     */
    String operator();

    /**
     *
     * @return 模版
     */
    String content();
}
