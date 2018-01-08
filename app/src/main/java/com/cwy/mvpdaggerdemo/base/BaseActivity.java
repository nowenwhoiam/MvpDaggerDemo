package com.cwy.mvpdaggerdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by Chenwy on 2018/1/3 14:23
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    @Inject
    protected P mPersenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setupActivityComponent();
        initData(savedInstanceState);
    }

    protected abstract int getLayoutId();

    protected abstract void setupActivityComponent();

    protected abstract void initData(Bundle savedInstanceState);


}
