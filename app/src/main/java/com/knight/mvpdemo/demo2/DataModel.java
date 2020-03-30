package com.knight.mvpdemo.demo2;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 16:44
 * @descript:数据请求层的入口
 */

public class DataModel {

    public static <T> T request(Class<T> clazz){
        //声明一个空的BaseModel
        T model = null;
        try {
            model = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;



    }
}
