package com.mine.retest.activity;

import com.facebook.react.ReactActivity;

import android.support.annotation.Nullable;

public class FlexTest extends ReactActivity{
        @Nullable
        @Override
        protected String getMainComponentName() {
            return "FlexTest";//这个在Registry.registerComponent注册
        }
}
