package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tongdigitTest {

    @Test
    void sumDigits() {
        assertEquals( 0, tongdigit.sumDigits(00));
    }
    @Test
    void sumDigits2() {
        assertEquals( 10, tongdigit.sumDigits(55));
    }
}
