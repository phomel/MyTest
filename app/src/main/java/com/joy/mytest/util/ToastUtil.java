package com.joy.mytest.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/31.
 */
public class ToastUtil {

    public static void showShortMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showShortMessage(Context context, int message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showLongMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showLongMessage(Context context, int message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

