package com.xianyue.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @auther xianyue
 * @date 2021/10/2 - 星期六 - 11:35
 **/

// 等价于 <bean id="user" class="com.xianyue.pojo.User"/>
@Component  // component : 组件
@Scope("singleton")
public class User {
    @Value("xianyue") // 相当于
    // <property name="name" value="xianyue"/>，也可以写在 set方法上
    public String name;
}
