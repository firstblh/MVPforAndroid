package com.firstblh.mvpforandroid.Model;

import com.firstblh.mvpforandroid.Bean.UserBean;

/**
 * Created by firstblh on 15/12/1.
 */
public interface IUserModel {
    void setId(int id);

    int getId();

    void setName(String name);

    void setAge(int age);

    UserBean load(int id);

}
