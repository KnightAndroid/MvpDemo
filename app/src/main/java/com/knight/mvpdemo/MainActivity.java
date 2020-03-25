package com.knight.mvpdemo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MvpView {


    //进度条
    ProgressDialog mProgressDialog;
    TextView text;
    MvpPresenter mMvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);

        // 初始化进度条
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setMessage("正在加载数据");

        //初始化Presenter
        mMvpPresenter = new MvpPresenter(this);
        //绑定View引用
        mMvpPresenter.attachView(this);
    }


    /**
     * Button 点击时间调用方法
     *
     * @param view
     */
    public void getData(View view) {
        mMvpPresenter.getData("normal");
    }


    // button 点击事件调用方法
    public void getDataForFailure(View view) {
        mMvpPresenter.getData("failure");
    }


    // button 点击事件调用方法
    public void getDataForError(View view) {
        mMvpPresenter.getData("error");
    }

    @Override
    public void showLoading() {
        if (!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }



    @Override
    public void showData(String data) {
        text.setText(data);
    }

    @Override
    public void showFailureMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        text.setText(msg);
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "网络请求数据出现异常", Toast.LENGTH_SHORT).show();
        text.setText("网络请求数据出现异常");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //断开View引用
        mMvpPresenter.detachView();
    }
}
