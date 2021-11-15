package com.xianyue.diy;

/**
 * @auther xianyue
 * @date 2021/10/3 - 星期日 - 21:56
 **/
public class DiyPointCut {
    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }
}
