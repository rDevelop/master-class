package us.rlit.expressions.exercises;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static us.rlit.expressions.exercises.DecimalComparator.areEqualByThreeDecimalPlaces;

public class TestDecimalComparator {

    @Test
    public void decimalComparator() {
        assertFalse(areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertTrue(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertTrue(areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertFalse(areEqualByThreeDecimalPlaces(-23304.0, -23304.01));
        assertTrue(areEqualByThreeDecimalPlaces(3.0,  3.00));
    }
}
