package com.xianyue.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @auther xianyue
 * @date 2021/10/3 - 星期日 - 20:25
 **/
public class Log implements MethodBeforeAdvice {

    // method : 要执行的目标对象的方法
    // args : 执行方法的参数
    // target : 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + " 的 " + method.getName() + " 被执行了");
    }
}
