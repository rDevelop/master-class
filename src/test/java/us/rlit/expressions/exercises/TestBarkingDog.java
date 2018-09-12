package us.rlit.expressions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static us.rlit.expressions.exercises.BarkingDog.bark;

public class TestBarkingDog {

    @Test
    public void barkingDog() {
        assertTrue(bark(true, 1));
        assertFalse(bark(false, 2));
        assertFalse(bark(true, 8));
        assertFalse(bark(true, -1));
        assertTrue(bark(true, 5));
        assertFalse(bark(false, 5));

    }


}
