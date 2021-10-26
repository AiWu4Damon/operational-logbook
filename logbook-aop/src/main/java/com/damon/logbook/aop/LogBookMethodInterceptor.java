package com.damon.logbook.aop;

import com.damon.logbook.annotation.LogRecord;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author 达蒙
 * @version 1.0
 * @date 2021/10/26 2:47 下午
 */
public class LogBookMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        return execute(methodInvocation);
    }

    /**
     * 记录日志的方法
     * 可以做 各种通知处理
     */
    private Object execute(MethodInvocation invoker) throws Throwable {
        //方法
        Method method = invoker.getMethod();
        //参数
        Object[] arguments = invoker.getArguments();
        //对象
        Object aThis = invoker.getThis();

        LogRecord annotation = method.getAnnotation(LogRecord.class);

        Object proceed = null;

        try {
            proceed = invoker.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return proceed;
    }
}
