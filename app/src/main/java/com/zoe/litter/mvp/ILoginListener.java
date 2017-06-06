package com.zoe.litter.mvp;

/**
 * Created by zhy on 15/6/19.
 */
public interface ILoginListener
{
    void loginSuccess(User user);

    void loginFailed();
}
