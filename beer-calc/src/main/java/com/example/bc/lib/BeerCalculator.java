package com.example.bc.lib;

/**
 *  计算器，用于解决下面的问题:
 *      假设某商店一瓶啤酒卖2元，用4个瓶盖或者用2个空啤酒瓶，都可以兑换一瓶啤酒
 *      计算当某顾客持有 n 元钱时，可以在商店喝几瓶啤酒？最后剩余多少钱？几个空瓶？几个瓶盖？
  */
public class BeerCalculator {
    static {
        System.loadLibrary("beer-calc");
    }

    /**
     *  根据钱计算啤酒相关的数据
     * @param n 持有的钱
     * @return 长度为4的数组，第一个元素代表喝了多少啤酒，第二个元素代表剩下多少钱，第三个元素代表剩余多少空瓶，第四个元素代表剩余多少个瓶盖
     */
    public static native int[] calc(int n);
}
