package com.example.test2;

/**
 * @author Kohsuke Kawaguchi
 */
public class Sample2Test {
    @org.junit.Test
    public void testPass() throws Exception {
    }

    @org.junit.Test
    public void testFail() throws Exception {
        throw new Exception();
    }
}
