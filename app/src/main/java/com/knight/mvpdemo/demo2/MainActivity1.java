package com.knight.mvpdemo.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.knight.mvpdemo.R;
import com.knight.mvpdemo.base.BaseActivity;
import com.knight.mvpdemo.base.BasePresenter;
import com.knight.mvpdemo.test.TestActivity;

/**
 * @author created by luguian
 * @organize 车童网
 * @Date 2020/3/26 19:14
 * @descript:第二个界面
 */

public class MainActivity1 extends BaseActivity implements MvpView1{



    TextView text;
    MvpPresenter1 mMvpPresenter1;


    @Override
    public BasePresenter getPresenter() {
       return mMvpPresenter1;
    }

    @Override
    public void initPresenter() {
        //初始化Presenter
        mMvpPresenter1 = new MvpPresenter1();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        //绑定view引用
        //mMvpPresenter1.attachView(this);
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }



    @Override
    public void showToast(String msg){
        super.showToast(msg);
        text.setText(msg);
    }




    // button 点击事件调用方法
    public void getData(View view){
        mMvpPresenter1.getData("normal");
    }

    // button 点击事件调用方法
    public void getDataForFailure(View view){
        mMvpPresenter1.getData("failure");
    }



    // button 点击事件调用方法
    public void getDataForError(View view){
        mMvpPresenter1.getData("error");
    }



    //跳转第二个界面
    public void test(View view){
        //finish();
        startActivity(new Intent(this, TestActivity.class));

    }











}
