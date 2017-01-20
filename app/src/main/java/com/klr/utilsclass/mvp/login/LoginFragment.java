package com.klr.utilsclass.mvp.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.klr.utilsclass.R;

/**
 * Created by BJ-0002 on 2016/9/9.
 *
 * @author klr
 */
public class LoginFragment extends Fragment implements LoginContract.View,View.OnClickListener{
    private LoginContract.Presenter mLoginPresenter;
    private EditText mName;
    private EditText mPassword;
    private Button mBtn_login;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.login_layout, null);
        mName = (EditText) inflate.findViewById(R.id.et_name);
        mPassword = (EditText) inflate.findViewById(R.id.et_password);
        mBtn_login = (Button) inflate.findViewById(R.id.btn_login);
        mBtn_login.setOnClickListener(this);
        return inflate;
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getActivity(),"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(getActivity(),"用户名或密码错误",Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUsename() {
        return mName.getEditableText().toString().trim();
    }

    @Override
    public String getPassword() {
        return mPassword.getEditableText().toString().trim();
    }

    @Override
    public void usernameNull() {
        Toast.makeText(getActivity(),"用户名不能为空",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void passwordNull() {
        Toast.makeText(getActivity(),"密码不能为空",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        if (presenter != null)
            mLoginPresenter=presenter;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mLoginPresenter.login();
                break;
        }
    }
}
