package com.xianyue.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther xianyue
 * @date 2021/10/2 - 星期六 - 18:15
 **/
@Component
public class User {
    @Value("xianyue")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
