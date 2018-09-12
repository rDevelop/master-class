package us.rlit.expressions.exercises;

import org.junit.Test;

import static us.rlit.expressions.exercises.AreaCalculator.area;

public class TestAreaCalculator {
    @Test
    public void testArea() {
        assert(area(5, 4) == 20.0);
        assert(area(-2) == -1.0);
        assert(area(-4, 4) == -1.0);
        assert(area(10,10) == 100.0);
        assert(area(41) > 0);
    }

}
