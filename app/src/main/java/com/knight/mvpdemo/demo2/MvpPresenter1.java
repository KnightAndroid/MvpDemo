package com.knight.mvpdemo.demo2;

import com.knight.mvpdemo.base.BasePresenter;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 19:03
 * @descript:业务逻辑处理类
 */

public class MvpPresenter1 extends BasePresenter<MvpView1> {


    /**
     *
     * 获取网络数据
      * @param params 参数
     */
   public void getData(String params){
      if(!isViewAttached()){
         //如果没有View引用就不加载数据
          return;
      }

      //显示正在加载进度条
      getView().showLoading();

      DataModel
              .request(UserDataModel.class)
              //添加请求参数,没有则不添加
              .params(params)
              //注册监听回调
              .execute(new CallBack<String>() {
                  @Override
                  public void onSuccess(String data) {
                      //调用view接口显示数据
                      getView().showData(data);
                  }

                  @Override
                  public void onFailure(String msg) {
                      //调用view接口显示失败信息
                      getView().showToast(msg);
                  }

                  @Override
                  public void onError() {
                      //调用view接口提示请求异常
                      getView().showErr();
                  }

                  @Override
                  public void onComplete() {
                       //隐藏正在加载进度条
                      getView().hideLoading();
                  }
              });

   }



}
