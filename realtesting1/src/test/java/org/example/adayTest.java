package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class adayTest {

    @Test
    void oclock() {
        assertEquals("1am", aday.oclock(1));
    }
    @Test
    void oclock2() {
        assertEquals("2am", aday.oclock(2));
    }
    @Test
    void oclock3() {
        assertEquals("3am", aday.oclock(3));
    }
    @Test
    void oclock4() {
        assertEquals("10am", aday.oclock(10));
    }
    @Test
    void oclock5() {
        assertEquals("3pm", aday.oclock(15));
    }
    @Test
    void oclock6() {
        assertEquals("11pm", aday.oclock(23));
    }
    @Test
    void oclock7() {
        assertEquals("12am", aday.oclock(24));
    }
    @Test
    void oclock8() {
        assertEquals("Invalid time", aday.oclock(25));
    }
}