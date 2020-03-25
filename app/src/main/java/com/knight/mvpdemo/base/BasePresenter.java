package com.knight.mvpdemo.base;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/23 21:39
 * @descript:基类业务逻辑类
 */

public class BasePresenter<V extends BaseView> {


    /**
     *
     * 绑定的view
     */
    private V mvpView;



    public void attachView(V mvpView){
        this.mvpView = mvpView;
    }


    /**
     *
     * 断开view,一般在onDestroy中调用
     */
    public void detachView(){
       this.mvpView = null;
    }

    /**
     *
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     * @return
     */
    public boolean isViewAttached(){
        return mvpView != null;
    }


    /**
     *
     * 获取连接的view
     * @return
     */
    public V getView(){
         return mvpView;
    }

}
