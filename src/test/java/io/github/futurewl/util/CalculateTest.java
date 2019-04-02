package io.github.futurewl.util;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-02:10:18
 * @version 1.0
 */
public class CalculateTest {

    @Test
    public void testAdd() {
        assertEquals(6, new Calculate().add(3, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, new Calculate().subtract(3, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(4, new Calculate().multiply(2, 2));
    }

    @Test
    void testDivision() {
        assertEquals(4, new Calculate().division(8, 2));
    }
}