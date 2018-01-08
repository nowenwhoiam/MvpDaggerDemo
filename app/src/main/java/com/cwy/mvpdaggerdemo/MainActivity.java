package com.cwy.mvpdaggerdemo;

import android.os.Bundle;
import android.widget.TextView;

import com.cwy.mvpdaggerdemo.base.BaseActivity;
import com.cwy.mvpdaggerdemo.di.DaggerMainComponent;
import com.cwy.mvpdaggerdemo.di.MainModule;
import com.cwy.mvpdaggerdemo.mvp.MainContract;
import com.cwy.mvpdaggerdemo.mvp.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {
    private TextView tv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupActivityComponent() {
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        tv = findViewById(R.id.text);
        mPersenter.requestData();
    }

    @Override
    public void showDatas() {
        tv.setText("dagger 运用成功.");
    }
}
