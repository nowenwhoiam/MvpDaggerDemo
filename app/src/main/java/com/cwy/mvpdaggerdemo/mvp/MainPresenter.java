package com.cwy.mvpdaggerdemo.mvp;

import javax.inject.Inject;

/**
 * Created by Chenwy on 2018/1/3 14:50
 */

public class MainPresenter extends MainContract.Presenter {

    private MainContract.View mView;

    @Inject
    public MainPresenter(MainContract.View view) {
        mView = view;
    }

    @Override
    public void requestData() {
        mView.showDatas();
    }
}
