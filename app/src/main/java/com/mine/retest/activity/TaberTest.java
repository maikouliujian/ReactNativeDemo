package com.mine.retest.activity;

import com.facebook.react.ReactActivity;

import android.support.annotation.Nullable;

public class TaberTest extends ReactActivity{
        @Nullable
        @Override
        protected String getMainComponentName() {
            return "TaberTest";//这个在Registry.registerComponent注册
        }
}
