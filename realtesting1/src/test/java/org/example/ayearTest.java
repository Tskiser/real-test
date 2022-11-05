package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ayearTest {

    @Test
    void year() {
        assertEquals("January", ayear.year(1));
    }
    @Test
    void year2() {
        assertEquals("February", ayear.year(2));
    }
    @Test
    void year3() {
        assertEquals("March", ayear.year(3));
    }
    @Test
    void year4() {
        assertEquals("July", ayear.year(7));
    }
    @Test
    void year5() {
        assertEquals("Invalid month", ayear.year(13));
    }
}