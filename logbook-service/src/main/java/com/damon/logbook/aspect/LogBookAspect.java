package com.damon.logbook.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 达蒙
 * @version 1.0
 * @date 2021/10/26 11:10 上午
 */
@Aspect
@Component
@Order(1)
public final class LogBookAspect {

    final static Logger logger = LoggerFactory.getLogger("");


}
