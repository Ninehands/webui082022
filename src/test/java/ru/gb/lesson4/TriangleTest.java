package ru.gb.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void TriangleTest1() throws SubZeroException {
        int result=new Triangle().TriangleArea(5, 6, 7);
        Assertions.assertEquals(7, result);

    }
    @Test
    void TriangleTest2() throws SubZeroException {
        int result=new Triangle().TriangleArea(5, 6, 7);
        Assertions.assertEquals(18, result);

    }
    @Test
    void TriangleTest3() throws SubZeroException {
        int result=new Triangle().TriangleArea(0, 6, 7);
        Assertions.assertEquals(18, result);

    }
}
