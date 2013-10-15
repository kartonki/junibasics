package com.kartonki.junitbasics;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * Test of main method, of class App.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        App tester= new App();
        //   Integer result =    tester.multiply(10, 5);
        //Integer result;
        //result = tester.multiply(3, 2);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
        //fail("The test case is a prototype.");
        //MyClass tester = new MyClass();
        //assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
    }
}
