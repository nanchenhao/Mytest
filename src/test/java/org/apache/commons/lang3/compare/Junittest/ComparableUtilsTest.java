package org.apache.commons.lang3.compare.Junittest;

import junit.framework.TestCase;
import org.apache.commons.lang3.compare.ComparableUtils;

public class ComparableUtilsTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
        System.out.println("测试开始");
    }

    public void tearDown() throws Exception{
        System.out.println("测试结束");
    }

    public void testBetween() {
        assertEquals(false, ComparableUtils.is(1).between(2,3));
    }

    public void testGe() {
        assertEquals(true,ComparableUtils.is(1).lessThan(4));
    }


    public void testLe() {

        assertEquals(true,ComparableUtils.is(1).greaterThan(0));
    }
}