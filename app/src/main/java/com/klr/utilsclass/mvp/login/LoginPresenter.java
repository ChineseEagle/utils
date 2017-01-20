package com.klr.utilsclass.mvp.login;

import android.text.TextUtils;

/**
 * Created by BJ-0002 on 2016/9/8.
 *
 * @author klr
 */
public class LoginPresenter implements LoginContract.Presenter {
    LoginFragment mLoginFragment;
    public LoginPresenter(LoginFragment loginFragment) {
        mLoginFragment=loginFragment;
        mLoginFragment.setPresenter(this);
    }

    @Override
    public void login() {
        String usename = mLoginFragment.getUsename();
        String password = mLoginFragment.getPassword();
        if (TextUtils.isEmpty(usename)) {
            mLoginFragment.usernameNull();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mLoginFragment.passwordNull();
            return;
        }
        if (usename.equals("q") && password.equals("q")) {
            mLoginFragment.loginSuccess();
        } else {
            mLoginFragment.loginFailure();
        }
    }

    @Override
    public void start() {

    }
}
