package com.cwy.mvpdaggerdemo.mvp;

import com.cwy.mvpdaggerdemo.base.BasePresenter;
import com.cwy.mvpdaggerdemo.base.BaseView;

/**
 * Created by Chenwy on 2018/1/3 14:38
 */

public class MainContract {
    public interface View extends BaseView {
        void showDatas();
    }

    public static abstract class Presenter extends BasePresenter {
        public abstract void requestData();
    }
}
