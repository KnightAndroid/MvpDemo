package com.knight.mvpdemo;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/19 20:26
 * @descript:逻辑业务处理类
 */

public class MvpPresenter  {



    private MvpView mView;

    public MvpPresenter(MvpView view){
        this.mView = view;
    }


    /**
     * 绑定View 一般在初始化中调用该方法
     * @param mvpView
     */
    public void attachView(MvpView mvpView){
        this.mView = mvpView;
    }


    /**
     *
     * 断开View，一般在onDestroy中调用
     */
    public void detachView(){
        this.mView = null;
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出线
     * @return
     */
    public boolean isViewAttached(){
        return mView!= null;
    }

    /**
     *
     * 获取网络数据
     * @param params
     */
    public void getData(String params){
       //显示正在加载进度条
       mView.showLoading();
       //调用Model请求数据
       MvpModel.getNetData(params, new MvpCallback() {
           @Override
           public void onSuccess(String data) {
               //调用view接口显示数据
               mView.showData(data);
           }

           @Override
           public void onFailure(String msg) {
               //调用view接口提示失败信息
               mView.showFailureMessage(msg);
           }

           @Override
           public void onError() {
               //调用view接口题色请求异常
               mView.showErrorMessage();
           }

           @Override
           public void onComplete() {
               //隐藏正在加载进度条
               mView.hideLoading();
           }
       });
    }

}
