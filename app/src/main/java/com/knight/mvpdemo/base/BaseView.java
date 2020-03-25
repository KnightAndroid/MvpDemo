package com.knight.mvpdemo.base;

import android.content.Context;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/23 21:29
 * @descript:基类View
 */

public interface BaseView {


    /**
     *
     * 显示正在加载view
     */
    void showLoading();

    /**
     *
     * 关闭正在加载view
     *
     */
    void hideLoading();


    /**
     *
     * 显示提示
     * @param msg
     */
    void  showToast(String msg);


    /**
     *
     * 显示请求错误提示
     */
    void showErr();


    /**
     *
     * 获取上下文
     * @return 上下文
     */
    Context getContext();


}
