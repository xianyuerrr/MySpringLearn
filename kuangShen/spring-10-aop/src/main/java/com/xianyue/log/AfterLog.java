package com.xianyue.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @auther xianyue
 * @date 2021/10/3 - 星期日 - 20:28
 **/
public class AfterLog implements AfterReturningAdvice {

    // 可以拿到返回值，比 before 多了一个参数
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了 " + method.getName() + " 方法，" + "返回结果为 : " + returnValue);
    }
}
