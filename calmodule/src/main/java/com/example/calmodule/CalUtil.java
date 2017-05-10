package com.example.calmodule;

/**
 * Created by edao on 2017/5/10.
 */

public class CalUtil {
    static {
        System.loadLibrary("calM-lib");
    }

    public static native int[] result(int n);
}
