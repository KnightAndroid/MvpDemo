package com.knight.mvpdemo.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 17:06
 * @descript:跟App相关的辅助类
 */

public class AppUtils {

    /**
     *
     * 获取程序
     * @param context
     * @return
     */
    public static synchronized String getPackageName(Context context){
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(),0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return packageInfo.packageName;
    }
}
