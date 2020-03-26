package com.knight.mvpdemo.demo2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.knight.mvpdemo.R;
import com.knight.mvpdemo.base.BaseActivity;

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
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        //初始化Presenter
        mMvpPresenter1 = new MvpPresenter1();
        //绑定view引用
        mMvpPresenter1.attachView(this);
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        //断开view引用
        mMvpPresenter1.detachView();
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











}
