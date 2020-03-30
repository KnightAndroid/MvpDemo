package com.knight.mvpdemo.test;

import android.os.Bundle;

import com.knight.mvpdemo.R;
import com.knight.mvpdemo.base.BaseActivity;
import com.knight.mvpdemo.base.BasePresenter;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/30 19:18
 * @descript:测试Activity
 */

public class TestActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);



    }
    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void initPresenter() {

    }
}
