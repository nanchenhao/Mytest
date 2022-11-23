package org.apache.commons.lang3.compare;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparableUtilsTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("测试开始");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("测试结束");
    }
    @Test
    public void testBetween() {
        assertEquals(ComparableUtils.is(1).between(3,0),true);
    }

    @Test
    public void testGe() {
        assertEquals(ComparableUtils.is(1).greaterThan(2),false);
    }


    @Test
    public void testLe() {
        assertEquals(ComparableUtils.is(1).lessThan(3),true);
    }
}