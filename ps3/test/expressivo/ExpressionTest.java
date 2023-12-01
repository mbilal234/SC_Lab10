/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
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
