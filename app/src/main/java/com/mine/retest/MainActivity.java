/*
package com.mine.retest;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;



//旧版的，新版的很简洁,高版本手机不用；
public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
    private ReactRootView mReactRootView;
    private ReactInstanceManager mReactInstanceManager;
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_RESUME;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        */
/* 下面的版本判断代码官方文档中没有， 如果不添加，在6.0以上的Android版本中会报错 *//*

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                Intent serviceIntent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                startActivity(serviceIntent);
            }
        }
        mReactRootView = new ReactRootView(this);
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(mLifecycleState)
                .build();
        //下面代码中的"HelloWorld"来自index.android.js文件中最后一行代码
        mReactRootView.startReactApplication(mReactInstanceManager, "HelloWorld", null);
        setContentView(mReactRootView);
    }


    @Override
    protected void onPause() {
        super.onPause();
        mLifecycleState = LifecycleState.BEFORE_RESUME;
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLifecycleState = LifecycleState.RESUMED;
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostResume(this, this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mReactRootView.unmountReactApplication();
        mReactRootView = null;
        if (mReactInstanceManager != null) {
            mReactInstanceManager.destroy();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onActivityResult(this, requestCode, resultCode, data);
        }
    }

    @Override
    public void onBackPressed() {
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}


*/
