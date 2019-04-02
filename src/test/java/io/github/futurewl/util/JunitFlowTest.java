package io.github.futurewl.util;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-02:10:18
 * @version 1.0
 */
public class JunitFlowTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");

    }

    @Test(expected = ArithmeticException.class)
    public void testAdd() {
        assertEquals(6, new Calculate().division(3, 0));
    }

    @Ignore(".......")
    @Test(timeout = 2000)
    public void testWhile() {
        while (true) {
            System.out.println("run forever...");
        }
    }
}