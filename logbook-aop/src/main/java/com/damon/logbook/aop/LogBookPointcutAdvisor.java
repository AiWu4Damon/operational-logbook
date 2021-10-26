package com.damon.logbook.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author 达蒙
 * @version 1.0
 * @date 2021/10/26 3:59 下午
 */
public class LogBookPointcutAdvisor extends AbstractBeanFactoryPointcutAdvisor {

    private final Pointcut pointcut = new LogBookStaticPointcut();

    private Advice advice = new LogBookMethodInterceptor();

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public void setAdvice(Advice advice) {
        super.setAdvice(advice);
    }
}
