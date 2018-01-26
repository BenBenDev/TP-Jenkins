/**
 * description for Tests in Calculator
 */
package com.imie.tp.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.imie.tp.calculator.operation.AdditionOperation;

public class Calculator {

    @Before
    public void setUp() throws Exception {
    }
    
    /**
     * Test method for {@link com.imie.calculator.Addition#make(int)}.
     */
    @Test
    public void testGeCurrentValuet() {
        AdditionOperation ope = new AdditionOperation(5);
        Assert.assertNotNull(ope);
        Assert.assertEquals(5, ope.getCurrentValue());
    }

    /**
     * Test method for {@link com.imie.calculator.Addition#make(int)}.
     */


//    @Test
//    public void testMake() {
//        AdditionOperation ope = new AdditionOperation(1);
//        Assert.assertNotNull(ope);
//
//        ope.make(4);
//        Assert.assertEquals(5, ope.currentValue);
//    }

}
