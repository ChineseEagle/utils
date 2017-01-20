package com.klr.utilsclass.mvp.login;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.klr.utilsclass.R;

/**
 * Created by BJ-0002 on 2016/9/9.
 *
 * @author klr
 */
public class LoginActivity extends FragmentActivity {
    private LoginFragment mLoginFragment = new LoginFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefultFragment();
        new LoginPresenter(mLoginFragment);
    }

    private void setDefultFragment() {
        FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        FragmentTransaction transaction = supportFragmentManager.beginTransaction();
        transaction.add(R.id.fl_login, mLoginFragment);
        transaction.commit();
    }
}
