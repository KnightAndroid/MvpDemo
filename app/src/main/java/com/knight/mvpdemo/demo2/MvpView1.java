package com.knight.mvpdemo.demo2;

import com.knight.mvpdemo.base.BaseView;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 17:36
 * @descript:MVPView1
 */

public interface MvpView1 extends BaseView {


    /**
     *
     * 当数据请求成功后,调用此接口显示数据
     * @param data 数据源
     */
    void showData(String data);
}
