package com.github.kshitij_jain.customlisteners;

import android.os.Handler;

/**
 * Created by flash on 14/3/17.
 */

public class CustomObject {

    private OnCustomListener mOnCustomListener;

    public CustomObject() {
        showToast();
    }

    public void setOnCustomListener(OnCustomListener onCustomListener) {
        mOnCustomListener = onCustomListener;
    }

    private void showToast() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mOnCustomListener.onCustom("It works");
            }
        }, 4000);
    }
}
