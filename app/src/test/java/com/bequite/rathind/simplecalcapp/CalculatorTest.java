package com.bequite.rathind.simplecalcapp;

import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {
    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers(){
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd,is(equalTo(2d)));
    }
    @Test
    public void addTwoNumbersNegative() {
     double resultAddtwoNeg = mCalculator.add(-1d,-2d);
     assertThat(resultAddtwoNeg,is(equalTo(-3d)));
    }

//    @Test
//    public void addTwoNumbersFloats() {
//        double resultAdd = mCalculator.add(1.111f, 1.111d);
//        assertThat(resultAdd, is(closeTo(2.222d)));
//    }

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }
    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }
//    @Test(expected=IllegalArgumentException.class)
//    public void divByZeroThrows() {
//      double resultDiv = mCalculator.div(0,0);
//        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
//    }
}
