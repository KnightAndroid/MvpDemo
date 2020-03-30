package com.knight.mvpdemo.demo2;

import android.os.Handler;

import com.knight.mvpdemo.base.BaseCallback;
import com.knight.mvpdemo.base.BaseModel;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 17:18
 * @descript:用户信息模型
 */

public class UserDataModel extends BaseModel<String> {
    @Override
    public void execute(final BaseCallback<String> callback) {
        //模拟网络请求耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               // mParams 是从父类得到的请求参数
                switch(mParams[0]){
                    case "normal":
                        callback.onSuccess("根据参数" + mParams[0] + "的请求网络数据成功");
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

    @Override
    public UserDataModel params(String... args){
        super.params(args);
        return this;
    }


}
