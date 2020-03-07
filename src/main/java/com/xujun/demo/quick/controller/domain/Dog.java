package com.xujun.demo.quick.controller.domain;

import lombok.Data;

/**
 * @author XuJun
 * @create 2020-03-07 11:17
 **/
@Data
public class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
