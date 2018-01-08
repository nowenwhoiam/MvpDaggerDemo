package com.cwy.mvpdaggerdemo.di;

import com.cwy.mvpdaggerdemo.mvp.MainContract;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Chenwy on 2018/1/3 16:59
 */

@Module
public class MainModule {
    private final MainContract.View mView;

    public MainModule(MainContract.View mView) {
        this.mView = mView;
    }

    @Provides
    MainContract.View provideMainView(){
        return mView;
    }
}
