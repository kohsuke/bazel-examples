package com.example.test;

/**
 * @author Kohsuke Kawaguchi
 */
public class SampleTest {
    @org.junit.Test
    public void testPass() throws Exception {
    }

    @org.junit.Test
    public void testFail() throws Exception {
        throw new Exception();
    }
}
