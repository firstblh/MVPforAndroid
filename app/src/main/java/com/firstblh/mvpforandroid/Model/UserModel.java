package com.firstblh.mvpforandroid.Model;

import com.firstblh.mvpforandroid.Bean.UserBean;

import java.util.ArrayList;

/**
 * Created by firstblh on 15/12/1.
 */
public class UserModel implements  IUserModel {
    private ArrayList<UserModel> list = new ArrayList<>();

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public UserBean load(int id) {
        return  new UserBean("白麟辉",18);
    }
}
