package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class tests {
    @Test
    void testMethod1() {
        one one = new one(12);
        double y = one.getY();
        double result = Math.ceil(y * 1000) / 1000;
        assertEquals(result, 46.084);
    }
    @Test
    void testMethod2() {
        double r;
        one one = new one(12);
        r = 5;
        boolean cond = one.ifYItInD(r);
        assertFalse(cond);
    }

    @Test
    void testMethod3() {
        two two = new two(0);
        assertEquals(two.getY(),0);
    }

    @Test
    void testMethod4() {
        two two = new two(-1);
        double result = Math.ceil(two.getY()*1000)/1000;
        assertEquals(result,1.195);
    }
}
