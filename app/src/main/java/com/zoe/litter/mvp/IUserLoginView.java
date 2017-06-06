package com.zoe.litter.mvp;

/**
 * Created by zhy on 15/6/19.
 */
public interface IUserLoginView
{
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void showSuccess(User user);

    void showFailedError();

}
