package us.rlit.expressions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static us.rlit.expressions.exercises.EqualSumChecker.hasEqualSum;

public class TestEqualSumChecker {

    @Test
    public void testEqualSum() {
        assertTrue(hasEqualSum(1,2, 3));
        assertFalse(hasEqualSum(1, 2, 4));
    }
}
