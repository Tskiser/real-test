package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class triangleTest {

    @Test
    void is_Valid() {
        assertEquals(true, triangle.is_Valid(34,34,35));
    }
    @Test
    void is_Valid2() {
        assertEquals(false, triangle.is_Valid(34,34,79));
    }

    @Test
    void area_triangle() {
        assertEquals(510.1332546501943, triangle.area_triangle(34,34,35));
    }
}