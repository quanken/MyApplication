package com.example.calmodule;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        int[] a = CalUtil.result(0);
        int[] a_expected = {0, 0, 0, 0};
        assertArrayEquals(a_expected, a);

        int[] b = CalUtil.result(1);
        int[] b_expected = {0, 1, 0, 0};
        assertArrayEquals(b_expected, b);

        int[] c = CalUtil.result(2);
        int[] c_expected = {1, 0, 1, 1};
        assertArrayEquals(c_expected, c);

        int[] d = CalUtil.result(-2);
        int[] d_expected = {-1, -1, -1, -1};
        assertArrayEquals(d_expected, d);
    }
}
