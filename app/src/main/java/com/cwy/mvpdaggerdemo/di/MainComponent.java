package com.cwy.mvpdaggerdemo.di;

import com.cwy.mvpdaggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by Chenwy on 2018/1/3 17:09
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
