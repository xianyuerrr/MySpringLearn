package com.xianyue.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @auther xianyue
 * @date 2021/10/1 - 星期五 - 16:27
 **/
public class People {
    // 也可以加在对应的 set方法上，效果一样，本质上还是 ByType（先） + ByName（后） 自动装配
    // 使用 Autowired注解注入之后，可以省去对应的 set方法
    @Autowired(required = false) // 如果显示定义 required = false，说明这个对象可以为 null，否则就不能为 null
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog1") // 当 ByName 和 ByType 都无法装配时，指定 bean 的 id，来确定具体装配哪个 bean
    private Dog dog;

    private String name;

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
