package com.firstblh.mvpforandroid.Presenter;

import com.firstblh.mvpforandroid.Bean.UserBean;
import com.firstblh.mvpforandroid.Model.IUserModel;
import com.firstblh.mvpforandroid.Model.UserModel;
import com.firstblh.mvpforandroid.View.IUserView;

/**
 * Created by firstblh on 15/12/1.
 */
public class UserPresenter {
    private IUserModel iUserModel;
    private IUserView iUserView;

    public UserPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        this.iUserModel = new UserModel();
    }

    public void saveUser(int id, String name, int age) {
        iUserModel.setId(id);
        iUserModel.setName(name);
        iUserModel.setAge(age);
    }

    public void loadUser(int id){
        UserBean bean = iUserModel.load(id);
        iUserView.setName(bean.getName());
        iUserView.setAge(bean.getAge());
    }
}
