/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;


// Testing strategy
/**
 * The testing strategy employed in this given code can be primarily classified as Unit Testing because each test method seems to be testing a single aspect or functionality of the code.
 * Here is a more detailed explanation of each test method:
 * testAssertionsEnabled is essentially testing if assertions are enabled in the Java Virtual Machine (JVM). If assertions are not enabled, this would raise an AssertionError, indicating the environment for running the test might not be set up correctly.
 * testConstantExpressionToString is testing if a ConstantExpression object returns the correct string format when its toString() method is called.
 * testAddExpressionToString checks that an AddExpression composed of two ConstantExpression objects returns the correct string format when its toString() method is called.
 * testNestedAddExpressionToString verifies that correctly nested AddExpression objects return the correct string output when their toString() method is invoked.
 * testComplexExpressionToString checks how complex nested expressions are handled and whether they correctly return the expected string output.
 * */
public class ExpressionTest {

    //  Test Case Partitioning
    /**
     * Single constant expressions:
     *          This is shown in the testConstantExpressionToString method where only a single value is being processed.
     * Simple additive expressions:
     *          This is shown in the testAddExpressionToString method where two values are being processed together.
     * Nested additive expressions:
     *          This is shown in the testNestedAddExpressionToString and testComplexExpressionToString methods where expressions are built upon other previously defined expressions, creating a nested structure.
     * */

    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO: tests for Expression
    @Test
    public void testConstantExpressionToString() {
        Expression constantExpression = new ConstantExpression(42.0);
        assertEquals("42.0", constantExpression.toString());
    }

    @Test
    public void testAddExpressionToString() {
        Expression constant1 = new ConstantExpression(5.0);
        Expression constant2 = new ConstantExpression(7.0);
        Expression addExpression = new AddExpression(constant1, constant2);
        assertEquals("(5.0 + 7.0)", addExpression.toString());
    }

    @Test
    public void testNestedAddExpressionToString() {
        Expression constant1 = new ConstantExpression(5.0);
        Expression constant2 = new ConstantExpression(7.0);
        Expression constant3 = new ConstantExpression(3.0);
        Expression addExpression1 = new AddExpression(constant1, constant2);
        Expression addExpression2 = new AddExpression(addExpression1, constant3);
        assertEquals("((5.0 + 7.0) + 3.0)", addExpression2.toString());
    }

    @Test
    public void testComplexExpressionToString() {
        Expression constant1 = new ConstantExpression(5.0);
        Expression constant2 = new ConstantExpression(7.0);
        Expression constant3 = new ConstantExpression(3.0);
        Expression addExpression1 = new AddExpression(constant1, constant2);
        Expression addExpression2 = new AddExpression(addExpression1, constant3);
        Expression constant4 = new ConstantExpression(2.0);
        Expression addExpression3 = new AddExpression(addExpression2, constant4);
        assertEquals("(((5.0 + 7.0) + 3.0) + 2.0)", addExpression3.toString());
    }

    // Additional test cases can be added based on your specific requirements

    
}
