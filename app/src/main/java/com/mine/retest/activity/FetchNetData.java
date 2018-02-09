package com.mine.retest.activity;

import com.facebook.react.ReactActivity;

import android.support.annotation.Nullable;

public class FetchNetData extends ReactActivity{
        @Nullable
        @Override
        protected String getMainComponentName() {
            return "FetchNetData";//这个在Registry.registerComponent注册
        }
}
