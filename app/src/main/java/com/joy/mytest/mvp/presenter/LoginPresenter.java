package com.joy.mytest.mvp.presenter;

import android.content.Context;

import com.joy.mytest.listener.CallbackListener;
import com.joy.mytest.mvp.model.ILoginModel;
import com.joy.mytest.mvp.model.LoginModel;
import com.joy.mytest.mvp.view.IloginView;

/**
 * Created by Administrator on 2016/12/21.
 */

public class LoginPresenter implements ILoginPresenter {

    private IloginView view;
    private ILoginModel model;

    public LoginPresenter(IloginView view, Context context) {
        this.view = view;
        this.model = new LoginModel(context);
    }

    @Override
    public void login(String userName, String pwd, CallbackListener listener) {
        model.loginQuery(userName, pwd, listener);
    }
}
