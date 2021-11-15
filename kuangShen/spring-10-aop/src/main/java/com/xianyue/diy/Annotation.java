package com.xianyue.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @auther xianyue
 * @date 2021/10/3 - 星期日 - 22:07
 **/
// 使用注解实现AOP
@Aspect // 标注这个类是一个切面
public class Annotation {

    @Before("execution(* com.xianyue.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.xianyue.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    // 在环绕增强中，我们可以给定一个参数,代表我们要处理切入的点
    @Around("execution(* com.xianyue.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature =  jp.getSignature(); // 获取签名
        System.out.println("signature : " + signature);

        Object proceed = jp.proceed(); // 执行方法

        System.out.println("环绕后");

        System.out.println(proceed);
        // 环绕前
        // signature : void com.xianyue.service.UserService.add()
        // 方法执行前
        //         增加了一个用户
        // 环绕后
        // null
        // 方法执行后
    }
}
