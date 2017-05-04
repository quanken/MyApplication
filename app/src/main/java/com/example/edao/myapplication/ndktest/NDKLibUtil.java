package com.example.edao.myapplication.ndktest;

/**
 * Created by edao on 2017/5/4.
 */

public class NDKLibUtil {
    static {
        System.loadLibrary("nativecodelib");
    }

    public static native String result(int n);
}
