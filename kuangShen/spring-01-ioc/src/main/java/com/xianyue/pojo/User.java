package com.xianyue.pojo;

/**
 * @auther xianyue
 * @date 2021/9/30 - 星期四 - 16:10
 **/
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
