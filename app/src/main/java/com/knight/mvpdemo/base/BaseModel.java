package com.knight.mvpdemo.base;

import java.util.Map;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/25 19:52
 * @descript:
 */

public abstract class BaseModel<T> {



    //数据请求参数
    protected String[] mParams;


    /**
     *
     * 设置数据请求参数
     * @param args 参数数组
     * @return
     */
    public BaseModel params(String... args){
        mParams = args;
        return this;
    }

    /**
     * 添加Callback并执行数据请求
     * @param callback
     */
   public abstract void execute(BaseCallback<T> callback);


    /**
     *
     * 执行Get网络请求，此类看需求由自己选择写与不写
     * @param url
     * @param callback
     */
    protected void requestGetAPI(String url,BaseCallback<T> callback){
         //这里写具体的网络请求

    }



    protected void requestPostAPI(String url, Map params,BaseCallback<T> callback){
         //这里写具体的网络请求
    }



}
