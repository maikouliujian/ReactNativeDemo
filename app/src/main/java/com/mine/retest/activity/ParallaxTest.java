package com.mine.retest.activity;

import com.facebook.react.ReactActivity;

import android.support.annotation.Nullable;

public class ParallaxTest extends ReactActivity{
        @Nullable
        @Override
        protected String getMainComponentName() {
            return "ParallaxTest";//这个在Registry.registerComponent注册
        }
}
