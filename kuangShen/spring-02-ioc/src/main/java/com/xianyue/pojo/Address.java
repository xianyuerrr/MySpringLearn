package com.xianyue.pojo;

/**
 * @auther xianyue
 * @date 2021/9/30 - 星期四 - 19:18
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
