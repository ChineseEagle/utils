package com.klr.utilsclass.mvp.login;

import com.klr.utilsclass.mvp.BasePresenter;
import com.klr.utilsclass.mvp.BaseView;

/**
 * Created by BJ-0002 on 2016/9/8.
 *
 * @author klr
 */
public interface LoginContract {
    interface Presenter extends BasePresenter {
        void login();
    }

    interface View extends BaseView<Presenter> {
        void loginSuccess();

        void loginFailure();

        String getUsename();

        String getPassword();

        void usernameNull();

        void passwordNull();
    }
}
