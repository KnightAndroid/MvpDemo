package com.knight.mvpdemo.demo2;

import com.knight.mvpdemo.base.BaseModel;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 16:44
 * @descript:数据请求层的入口
 */

public class DataModel {




    public static BaseModel request(Class clazz){
        //声明一个空的BaseModel
        BaseModel model = null;


        try {
            model = (BaseModel)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return model;

    }
}
