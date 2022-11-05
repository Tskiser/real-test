package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class middleTest {

    @Test
    void middlecharacter() {
        assertEquals("5", middle.middlecharacter("150"));
    }
    @Test
    void middlecharacter2() {
        assertEquals("ag", middle.middlecharacter("gagagaga"));
    }
}