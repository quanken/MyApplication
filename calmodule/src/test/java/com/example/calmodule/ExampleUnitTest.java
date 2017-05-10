package com.example.calmodule;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

//    static{
//        System.loadLibrary("calM-lib");
//    }
//
//    public static native int[] result(int n);
//
    @Before
    public void setup() {
        System.loadLibrary("calM-lib");
    }

    @Test
    public void testCalResult(){
        //assertEquals(4, 2 + 2);
    int[] a = CalUtil.result(0);
        System.out.printf("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", 0 , a[0], a[1], a[2], a[3]);
    int[] b = CalUtil.result(1);
        System.out.printf("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", 1 , b[0], b[1], b[2], b[3]);
    int[] c = CalUtil.result(2);
        System.out.printf("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", 2 , c[0], c[1], c[2], c[3]);
    int[] d = CalUtil.result(-2);
        System.out.printf("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", -2 , d[0], d[1], d[2], d[3]);
   }

}