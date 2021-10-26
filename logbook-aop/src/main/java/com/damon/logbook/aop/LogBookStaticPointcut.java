package com.damon.logbook.aop;

import com.damon.logbook.annotation.LogRecord;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * @author 达蒙
 * @version 1.0
 * @date 2021/10/26 2:40 下午
 */
public class LogBookStaticPointcut extends StaticMethodMatcherPointcut implements Serializable {

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return null != method.getAnnotation(LogRecord.class);
    }
}
