package us.rlit.expressions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static us.rlit.expressions.exercises.TestNumberChecker.hasTeen;

public class TestTestNumberChecker {

    @Test
    public void testHasTeen() {
        assertFalse(hasTeen(22,23,34));
    }
}
