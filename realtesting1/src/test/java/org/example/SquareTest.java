package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void squareRoot() {
        assertEquals(2, Square.squareRoot(4));

    }
    @Test
    void squareRoot2() {
        assertEquals(4, Square.squareRoot(16));

    }

}