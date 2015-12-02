package com.firstblh.mvpforandroid.Bean;

/**
 * Created by firstblh on 15/12/1.
 */
public class UserBean {
    private int id;
    private String name;
    private int age;

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
