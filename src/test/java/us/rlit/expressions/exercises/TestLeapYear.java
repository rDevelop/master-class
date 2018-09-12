package us.rlit.expressions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static us.rlit.expressions.exercises.LeapYear.isLeapYear;

public class TestLeapYear {

    @Test
    public void testIsLeapYear() {
        assertTrue(isLeapYear(1600));
        assertFalse(isLeapYear(2017));
        assertFalse(isLeapYear(-1600));
    }

}
