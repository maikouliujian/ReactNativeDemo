package com.mine.retest.activity;

import com.facebook.react.ReactActivity;

import android.support.annotation.Nullable;

public class TopTabViewTest extends ReactActivity{
        @Nullable
        @Override
        protected String getMainComponentName() {
            return "TopTabViewTest";//这个在Registry.registerComponent注册
        }
}
