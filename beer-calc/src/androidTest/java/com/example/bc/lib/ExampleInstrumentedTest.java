package com.example.bc.lib;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        int[] a = BeerCalculator.calc(0);
        int[] a_expected = {0, 0, 0, 0};
        assertArrayEquals(a_expected, a);

        //TODO: 测试用例错误
        int[] b = BeerCalculator.calc(1);
        int[] b_expected = {0, 1, 0, 0};
        assertArrayEquals(b_expected, b);

        int[] c = BeerCalculator.calc(2);
        int[] c_expected = {1, 0, 1, 1};
        assertArrayEquals(c_expected, c);

        //TODO: 这个是属于非法行为，程序要考虑如何应对
        int[] d = BeerCalculator.calc(-2);
        int[] d_expected = {-1, -1, -1, -1};
        assertArrayEquals(d_expected, d);
    }
}
