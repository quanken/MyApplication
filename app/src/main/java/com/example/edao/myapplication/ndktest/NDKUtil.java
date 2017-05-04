package com.example.edao.myapplication.ndktest;

/**
 * Created by edao on 2017/5/2.
 */

public class NDKUtil {
    static {
        System.loadLibrary("nativecode");
    }
    public static native String getLibName();

    public static native String result(int n);
}
