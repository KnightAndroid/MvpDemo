package com.knight.mvpdemo;

import android.os.Handler;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/19 20:14
 * @descript:具体的网络请求操作
 */

public class MvpModel {

    public static void getNetData(final String param,final MvpCallback callback){

        //利用postDelayed方法模拟网络请求数据的耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               switch (param){
                   case "normal":
                       callback.onSuccess("根据参数"+param+"的请求网络数据成功");
                       break;
                   case "failure":
                       callback.onFailure("请求失败:参数有误");
                       break;
                   case "error":
                       callback.onError();
                       break;
               }

               callback.onComplete();



            }
        },2000);
    }
}
